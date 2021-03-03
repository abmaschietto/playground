package br.com.tdv.playground.builders;

import java.util.List;

import org.springframework.http.HttpStatus;

import br.com.tdv.playground.models.dto.ListOfFieldsErrorsDto;

public interface IFormErrorBuilder {
	
	void setListErrors(List<ListOfFieldsErrorsDto> listFields);
	
	void setMessage(String message);
	
	void setHttpStatus(HttpStatus status);
	
	void setUri(String uri);

}
