package br.com.fatec.gabriel.exercicio01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value= {"br.com.fatec.gabriel.exercicio01"})

public class ApplicationConfiguration {
	
	@Bean(name= {"mensagem1"})
	public Passageiro passageiro1() {
		Passageiro mensagem = new Passageiro();
		mensagem.setNome("Gabriel");
		return mensagem;
	}
	
	@Bean(name = {"mensagem2"})
	public Aluno aluno01() {
		Aluno mensagem = new Aluno();
		mensagem.setNome("Brendon");
		return mensagem;
	}
	
	@Bean(name= {"mensagem3"})
	public Documento documento01() {
		Documento mensagem = new Documento();
		mensagem.setNome("Diploma de Análise e desenvolvimento de Sistemas");
		return mensagem;
	}
}
