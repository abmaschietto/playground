package br.com.tdv.playground.models.dto;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormErrorHandlerDto extends ErrorDto{
	
	@JsonProperty(value = "error fields")
	private List<ListOfFieldsErrorsDto> listFields;
	
	public FormErrorHandlerDto() {}

	public FormErrorHandlerDto(String message, HttpStatus httpStatus, 
			String uri, List<ListOfFieldsErrorsDto> listFields) {
		super(message, httpStatus, uri);
		this.listFields = listFields;
	}

	public List<ListOfFieldsErrorsDto> getListFields() {
		return listFields;
	}

	public void setListFields(List<ListOfFieldsErrorsDto> listFields) {
		this.listFields = listFields;
	}


}
