package br.com.tdv.playground.models.form;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoForm {
	
	@NotEmpty(message = "Não pode estar em branco bebiloide")
	@Length(min = 2, max = 10)
	@JsonProperty(value = "placa do veiculo")
	private String placa;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
