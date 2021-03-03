package br.com.tdv.playground.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "TDVADM.T_CAR_VEICULO")
@IdClass(ChaveCompostaVeiculo.class)
public class Veiculo {
	
	@Id
	@Column(name = "CAR_VEICULO_PLACA")
	private String placa;
	
	@Id
	@Column(name = "CAR_VEICULO_SAQUE")
	private String saque;
	
	@Column(name = "CAR_VEICULO_MARCA")
	private String marca;
	
	public Veiculo() {}

	public Veiculo(String placa, String saque, String marca) {
		super();
		this.placa = placa;
		this.saque = saque;
		this.marca = marca;
	}

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", saque=" + saque + ", marca=" + marca + "]";
	}
	
}
