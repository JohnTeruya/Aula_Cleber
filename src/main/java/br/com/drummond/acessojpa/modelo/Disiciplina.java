package br.com.drummond.acessojpa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_disciplina")
public class Disiciplina {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="nome_disciplina", nullable=false)
	private String nome;
	
	
	@ManyToOne
	@JoinColumn(name="curso_id")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name="professor_id")
	private Professor professor;
	
}
