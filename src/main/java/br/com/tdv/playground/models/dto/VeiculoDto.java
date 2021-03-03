package br.com.tdv.playground.models.dto;

public class VeiculoDto {
	
	private String marca;

	public VeiculoDto(String marca) {
		super();
		this.marca = marca.trim();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca.trim();
	}
	

}
