package br.com.drummond.acessojpa2.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.drummond.acessojpa.modelo.Aluno;
import br.com.drummond.acessojpa2.repository.AlunoRepository;

@RestController
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	
	
    @RequestMapping(value="/cadastra-aluno")
    	public String cadastra() {
    	
    	Aluno aluno = new Aluno();
    	aluno.setRa("12345");
    	aluno.setNome("Fulano de Tal");
    	aluno.setEmail("fulano@drummond.com.br");
    	Calendar nascimento = Calendar.getInstance();
    	nascimento.set(1990, 12, 12);;
    	aluno.setNascimento(nascimento);
    	
    	
    	aluno = alunoRepository.save(aluno);
    	
        return "Aluno cadastro: " + aluno;
    }
    
    @RequestMapping(value="/excluir")
    public String apaga(long id){
    	alunoRepository.deleteById(id);
    	return "Aluno excluido";
    }
}