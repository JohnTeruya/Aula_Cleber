package br.com.drummond.acessojpa.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	
	@Column(name="endereco", length=60, nullable=false)
	private String endereco;
	
	@Column(name="numero", length=10, nullable=false)
	private int numero;
	
	@Column(name="cep", length=8)
	private String cep;
	
	@Column(name="bairro", length=50)
	private String bairro;
	
	@Column(name="cidade", length=30)
	private String cidade;
	
	@Column(name="uf", length=30)
	private String uf;
	
	@Column(name="complemento", length=30)
	private String complemento;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
