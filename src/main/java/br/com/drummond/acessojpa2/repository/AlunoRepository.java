package br.com.drummond.acessojpa2.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.drummond.acessojpa.modelo.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Serializable> {

}
