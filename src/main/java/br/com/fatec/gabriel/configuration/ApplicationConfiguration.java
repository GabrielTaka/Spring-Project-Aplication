package br.com.fatec.gabriel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.fatec.gabriel.models.Carro;
import br.com.fatec.gabriel.models.Certificado;
import br.com.fatec.gabriel.models.PessoaFisica;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public Carro carro1() {
		Carro novoCarro = new Carro();
		
		novoCarro.setAno(2000);
		novoCarro.setCor("Azul");
		novoCarro.setMarca("Honda");
		novoCarro.setNome("Seu zé carros");
		
		return novoCarro;
	}
	
	@Bean 
	public Certificado certificato1() {
		Certificado novoCertificado = new Certificado();
		
		novoCertificado.setAnoDeConclusao(2019);
		novoCertificado.setAnoDeInicio(2016);
		novoCertificado.setInstituicao("Fatec");
		novoCertificado.setNome("Gabriel");
		
		return novoCertificado;
	}
	
	@Bean 
	public PessoaFisica pessoaFisica1() {
		
		PessoaFisica novaPessoaFisica = new PessoaFisica();
		
		novaPessoaFisica.setCpf("41588978093");
		novaPessoaFisica.setIdade(20);
		novaPessoaFisica.setNome("Gabriel");
		novaPessoaFisica.setUltimoNome("Vargas");
		
		return novaPessoaFisica;
	}
}
