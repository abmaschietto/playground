package br.com.tdv.playground.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDVADM.T_GLB_ESTADO")
public class Estados {
	
	@Id
	@Column(name = "GLB_ESTADO_CODIGO")
	private String estadoCodigo;
	
	@Column(name = "GLB_ESTADO_DESCLEI")
	private String descricaoLei;
	
	public Estados() {}

	public Estados(String estadoCodigo, String descricaoLei) {
		super();
		this.estadoCodigo = estadoCodigo;
		this.descricaoLei = descricaoLei;
	}

	public String getEstadoCodigo() {
		return estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	public String getDescricaoLei() {
		return descricaoLei;
	}

	public void setDescricaoLei(String descricaoLei) {
		this.descricaoLei = descricaoLei;
	}

	@Override
	public String toString() {
		return "Estados [estadoCodigo=" + estadoCodigo + ", descricaoLei=" + descricaoLei + "]";
	}
	
}
