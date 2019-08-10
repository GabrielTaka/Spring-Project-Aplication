package br.com.fatec.gabriel.exercicio01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Nome dos integrantes do grupo
 *	Gabriel Frederico Takahashi Vargas
 * 	Brendon Prado 
 */

public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		Carro carroObj = (Carro) context.getBean(Carro.class);
		carroObj.setAno(2000);
		carroObj.setMarca("Honda");
		carroObj.setCor("Vermelho");
		
		System.out.println("Dados do carro ");
		System.out.println(carroObj.ler());
		System.out.println("Marca:" + carroObj.getMarca());
		System.out.println("Ano:" + carroObj.getAno());
		System.out.println("Cor:" + carroObj.getCor());
		System.out.println("++++++++++++++++++++++++++");
		
		PessoaFisica pessoaObj = (PessoaFisica) context.getBean(PessoaFisica.class);
		pessoaObj.setCidade("Caçapava");
		pessoaObj.setIdade(20);
		pessoaObj.setProfissao("Desenvolvedor Jr.");
		
		System.out.println("Dados da Pessoa");
		System.out.println(pessoaObj.ler());
		System.out.println("Profissão: " + pessoaObj.getProfissao());
		System.out.println("Cidade: " + pessoaObj.getCidade());
		System.out.println("Idade: " + pessoaObj.getIdade());
		System.out.println("++++++++++++++++++++++++++");
		
		Certificado certificadoObj = (Certificado) context.getBean(Certificado.class);
		certificadoObj.setAnoDeEmissao(2019);
		certificadoObj.setIdade(21);
		certificadoObj.setNomeDoFormado("Gabriel");
		
		System.out.println(certificadoObj.ler());
		System.out.println("Formando: " + certificadoObj.getNomeDoFormado());
		System.out.println("Idade: " + certificadoObj.getIdade());
		System.out.println("Ano de emissao: " + certificadoObj.getAnoDeEmissao());
    }
}
