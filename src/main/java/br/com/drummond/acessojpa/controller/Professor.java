package br.com.drummond.acessojpa.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_professor")
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column(name="ri", nullable=false)
	private int ri;
	
}
