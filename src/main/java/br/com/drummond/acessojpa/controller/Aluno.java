package br.com.drummond.acessojpa.controller;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nome_completo", length=60)
	private String nome;
	
	@Column(name="registro_aluno", length=15, nullable=false)
	private String ra;
	
	@Column(name="email", length=100, nullable=false)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_nascimento")
	private Calendar nascimento;
	
	@ManyToOne
	@JoinColumn(name="endereco_id")
	private Endereco endereco;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", ra=" + ra + ", email=" + email + ", nascimento=" + nascimento
				+ ", endereco=" + endereco + "]";
	}

	
	
}
