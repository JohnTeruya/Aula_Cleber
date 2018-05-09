package br.com.drummond.acessojpa.modelo;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.drummond.acessojpa.controller.Aluno;
import br.com.drummond.acessojpa.repository.AlunoRepository;


@RestController
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
    @RequestMapping(value="/cadastra-aluno")
    	public String cadastraAluno() {
    	
    	Aluno aluno = new Aluno();
    	aluno.setRa("12345");
    	aluno.setNome("Fulano de Tal");
    	aluno.setEmail("fulano@drummond.com.br");
    	Calendar nascimento = Calendar.getInstance();
    	nascimento.set(1990, 12, 12);;
    	aluno.setNascimento(nascimento);
    	
        return "Aluno cadastro: " + aluno;
    }
}