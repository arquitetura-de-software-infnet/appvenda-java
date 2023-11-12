package br.edu.infnet.appvenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Bebida" )
public class Bebida extends Produto {

	private String marca;
	private String sabor;
	private Boolean alcoolica;
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s - %s", 
			super.toString(), marca, sabor, alcoolica);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public Boolean getAlcoolica() {
		return alcoolica;
	}
	public void setAlcoolica(Boolean alcoolica) {
		this.alcoolica = alcoolica;
	}	
}
