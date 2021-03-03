package br.com.tdv.playground.models.dto;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDto {
	
	@JsonProperty(value = "error message")
	private String message;

	@JsonProperty(value = "http status")
	private HttpStatus httpStatus;
	
	@JsonProperty(value = "uri request")
	private String uri;
	
	public ErrorDto() {}

	public ErrorDto(String message, HttpStatus httpStatus, String uri) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
		this.uri = uri;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
}
