package br.edu.infnet.appvenda.model.domain;

public class Produto {
	
	private Integer codigo;
	private String descricao;
	private Float preco;
	private Boolean estoque;
	
	@Override
	public String toString() {
		return String.format("%d - %s - %.2f - %s", codigo, descricao, preco, estoque);
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Boolean getEstoque() {
		return estoque;
	}
	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}
}
