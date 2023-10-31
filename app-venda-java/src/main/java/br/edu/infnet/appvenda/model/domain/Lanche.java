package br.edu.infnet.appvenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Lanche" )
public class Lanche extends Produto{
	
	private Boolean vegetariano;
	private String tipo;
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", super.toString(), vegetariano, tipo);
	}
	
	public Boolean getVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(Boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
