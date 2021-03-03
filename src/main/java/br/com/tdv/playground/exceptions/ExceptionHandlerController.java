package br.com.tdv.playground.exceptions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.tdv.playground.builders.ErrorDirector;
import br.com.tdv.playground.builders.FormErrorBuilder;
import br.com.tdv.playground.models.dto.ErrorDto;
import br.com.tdv.playground.models.dto.FormErrorHandlerDto;
import br.com.tdv.playground.models.dto.ListOfFieldsErrorsDto;

/**
 * Controller que monitora outros controllers da aplicação, captura as exceções
 * lançadas por eles e trata-as.
 */

@ControllerAdvice
public class ExceptionHandlerController {
	
	@Autowired
	private MessageSource messageSource;
	
	private HttpStatus statusBadRequest = HttpStatus.BAD_REQUEST;

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> Exception(Exception exception) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(InvalidConfigurationPropertyValueException.class)
	public ResponseEntity<?> resourceNotFoundException(InvalidConfigurationPropertyValueException exception) {
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MissingDataException.class)
	public ResponseEntity<ErrorDto> missingDataException(MissingDataException ex, HttpServletRequest request){
		ErrorDto error = new ErrorDto(ex.getMessage(), statusBadRequest, request.getRequestURI());
		return ResponseEntity.status(statusBadRequest).body(error);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<FormErrorHandlerDto> invalidForm(MethodArgumentNotValidException ex, HttpServletRequest request) {
		ErrorDto errorDto = new ErrorDto("Error de validação", statusBadRequest, request.getRequestURI());
		FormErrorBuilder formErrorBuilder = new FormErrorBuilder();
		List<ListOfFieldsErrorsDto> listErrors = new ArrayList<>();
		List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
		fieldErrors.forEach(error ->{
			String field = error.getField();
			String message = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			ListOfFieldsErrorsDto formularioErrorHandlerDto = new ListOfFieldsErrorsDto(field, message);
			listErrors.add(formularioErrorHandlerDto);
		});
		ErrorDirector.constructFormError(formErrorBuilder, listErrors, errorDto);
		FormErrorHandlerDto formHandler = formErrorBuilder.createFormError();
		return ResponseEntity.status(statusBadRequest).body(formHandler);
	}
}
