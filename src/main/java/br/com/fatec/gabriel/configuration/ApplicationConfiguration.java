package br.com.fatec.gabriel.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.fatec.gabriel.models.Carro;
import br.com.fatec.gabriel.models.Certificado;
import br.com.fatec.gabriel.models.HellowPeople;
import br.com.fatec.gabriel.models.PessoaFisica;

@Configuration
@ComponentScan(value={"br.gov.sp.fatec"})
public class ApplicationConfiguration {
	
	@Bean(name= {"Carro"})
	public Carro carro1() {
		Carro novoCarro = new Carro();
		
		novoCarro.setAno(2000);
		novoCarro.setCor("Azul");
		novoCarro.setMarca("Honda");
		novoCarro.setNome("Seu zé carros");
		
		return novoCarro;
	}
	
	@Bean(name= {"Certificado"}) 
	public Certificado certificato1() {
		Certificado novoCertificado = new Certificado();
		
		novoCertificado.setAnoDeConclusao(2019);
		novoCertificado.setAnoDeInicio(2016);
		novoCertificado.setInstituicao("Fatec");
		novoCertificado.setNome("Gabriel");
		
		return novoCertificado;
	}
	
	
	@Bean(name={"pessoaMenssagem"})
	public HellowPeople getPessoaFisica() {
		HellowPeople novaPessoaFisica = new HellowPeople();
		novaPessoaFisica.setNome("Gabriel");
		return novaPessoaFisica;
	}
}


