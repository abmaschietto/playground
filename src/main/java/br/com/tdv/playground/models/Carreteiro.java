package br.com.tdv.playground.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TDVADM.T_CAR_CARRETEIRO")
public class Carreteiro {

	@EmbeddedId
	private CarreteiroChaveComposta chaveComposta;
	
	@Column(name = "CAR_CARRETEIRO_RGCODIGO")
	private String rgCodigo;
	
	@Column(name = "CAR_CARRETEIRO_NOME")
	private String carreteiroNome;
	
	@ManyToOne
	@JoinColumn(name = "GLB_ESTADORG_CODIGO")
	private Estados estadoRgCodigo;
	
	public Carreteiro() {}

	public Carreteiro(CarreteiroChaveComposta chaveComposta, String rgCodigo, String carreteiroNome,
			Estados estadoRgCodigo) {
		super();
		this.chaveComposta = chaveComposta;
		this.rgCodigo = rgCodigo;
		this.carreteiroNome = carreteiroNome;
		this.estadoRgCodigo = estadoRgCodigo;
	}

	public CarreteiroChaveComposta getChaveComposta() {
		return chaveComposta;
	}

	public void setChaveComposta(CarreteiroChaveComposta chaveComposta) {
		this.chaveComposta = chaveComposta;
	}

	public String getRgCodigo() {
		return rgCodigo;
	}

	public void setRgCodigo(String rgCodigo) {
		this.rgCodigo = rgCodigo;
	}

	public String getCarreteiroNome() {
		return carreteiroNome;
	}

	public void setCarreteiroNome(String carreteiroNome) {
		this.carreteiroNome = carreteiroNome;
	}

	public Estados getEstadoRgCodigo() {
		return estadoRgCodigo;
	}

	public void setEstadoRgCodigo(Estados estadoRgCodigo) {
		this.estadoRgCodigo = estadoRgCodigo;
	}

	@Override
	public String toString() {
		return "Carreteiro [chaveComposta=" + chaveComposta + ", rgCodigo=" + rgCodigo + ", carreteiroNome="
				+ carreteiroNome + ", estadoRgCodigo=" + estadoRgCodigo + "]";
	}
	
}
