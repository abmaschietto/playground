package br.com.tdv.playground.builders;

import java.util.List;

import br.com.tdv.playground.models.dto.ErrorDto;
import br.com.tdv.playground.models.dto.ListOfFieldsErrorsDto;

public class ErrorDirector {
	
	public static void constructFormError(IFormErrorBuilder formErrorBuilder,
			List<ListOfFieldsErrorsDto> listFields, ErrorDto error) {
		formErrorBuilder.setHttpStatus(error.getHttpStatus());
		formErrorBuilder.setListErrors(listFields);
		formErrorBuilder.setMessage(error.getMessage());
		formErrorBuilder.setUri(error.getUri());
	}

}
