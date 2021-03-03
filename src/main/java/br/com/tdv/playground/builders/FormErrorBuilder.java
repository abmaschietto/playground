package br.com.tdv.playground.builders;

import java.util.List;

import org.springframework.http.HttpStatus;

import br.com.tdv.playground.models.dto.FormErrorHandlerDto;
import br.com.tdv.playground.models.dto.ListOfFieldsErrorsDto;

public class FormErrorBuilder implements IFormErrorBuilder{
	
	private String message;
	private HttpStatus httpStatus;
	private String uri;
	private List<ListOfFieldsErrorsDto> listFields;

	@Override
	public void setListErrors(List<ListOfFieldsErrorsDto> listFields) {
		this.listFields = listFields;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setHttpStatus(HttpStatus status) {
		this.httpStatus = status;
	}

	@Override
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public FormErrorHandlerDto createFormError() {
		return new FormErrorHandlerDto(message, httpStatus, uri, listFields);
	}

}
