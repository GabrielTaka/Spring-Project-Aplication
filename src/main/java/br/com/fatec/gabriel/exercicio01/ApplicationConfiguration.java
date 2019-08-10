package br.com.fatec.gabriel.exercicio01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(value= {"br.com.fatec.gabriel.exercicio01"})
public class ApplicationConfiguration {
	
	@Bean(name={"mensagem1"}) //Nao e necessario especificar um nome
	public Menssagem getMensagem() {
		HelloWorld mensagem = new HelloWorld();
		mensagem.setNome("Newcomer");
		return mensagem;
	}
	
}
