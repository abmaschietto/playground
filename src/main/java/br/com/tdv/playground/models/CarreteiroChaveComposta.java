package br.com.tdv.playground.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CarreteiroChaveComposta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name = "CAR_CARRETEIRO_CPFCODIGO")
	private String  cpfCodigo;
	
	@Column(name = "CAR_CARRETEIRO_SAQUE")
	private String carreteiroSaque;
	
	@Column(name = "CAR_VEICULO_PLACA")
	private String placa;
	
	@Column(name = "CAR_VEICULO_SAQUE")
	private String veiculoSaque;
	
	public CarreteiroChaveComposta() {}

	public CarreteiroChaveComposta(String cpfCodigo, String carreteiroSaque, String placa, String veiculoSaque) {
		super();
		this.cpfCodigo = cpfCodigo;
		this.carreteiroSaque = carreteiroSaque;
		this.placa = placa;
		this.veiculoSaque = veiculoSaque;
	}

	public String getCpfCodigo() {
		return cpfCodigo;
	}

	public void setCpfCodigo(String cpfCodigo) {
		this.cpfCodigo = cpfCodigo;
	}

	public String getCarreteiroSaque() {
		return carreteiroSaque;
	}

	public void setCarreteiroSaque(String carreteiroSaque) {
		this.carreteiroSaque = carreteiroSaque;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getVeiculoSaque() {
		return veiculoSaque;
	}

	public void setVeiculoSaque(String veiculoSaque) {
		this.veiculoSaque = veiculoSaque;
	}

	@Override
	public String toString() {
		return "CarreteiroChaveComposta [cpfCodigo=" + cpfCodigo + ", carreteiroSaque=" + carreteiroSaque + ", placa="
				+ placa + ", veiculoSaque=" + veiculoSaque + "]";
	}
	
}
