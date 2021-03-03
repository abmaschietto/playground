package br.com.tdv.playground.models;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChaveCompostaVeiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String placa;
	
	private String saque;
	
	public ChaveCompostaVeiculo() {}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getSaque() {
		return saque;
	}

	public void setSaque(String saque) {
		this.saque = saque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((saque == null) ? 0 : saque.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChaveCompostaVeiculo other = (ChaveCompostaVeiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (saque == null) {
			if (other.saque != null)
				return false;
		} else if (!saque.equals(other.saque))
			return false;
		return true;
	}
	
}
