package br.com.fatec.gabriel.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.com.fatec.gabriel.interfaces.Pessoa;


@Component
public class PessoaFisica {
	
	@Autowired
	@Qualifier("pessoaMenssagem") 
	private Pessoa pessoa;
	
	
	public String ler() {
		return "[ <" + pessoa.getPessoa() + "> ]";
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
		
}
