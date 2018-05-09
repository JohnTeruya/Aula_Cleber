package br.com.drummond.acessojpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.drummond.acessojpa.controller.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Serializable> {

}
