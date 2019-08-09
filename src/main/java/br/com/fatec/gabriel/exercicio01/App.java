package br.com.fatec.gabriel.exercicio01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.fatec.gabriel.configuration.ApplicationConfiguration;
import br.com.fatec.gabriel.models.Carro;
import br.com.fatec.gabriel.models.Certificado;
import br.com.fatec.gabriel.models.PessoaFisica;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = 
        		new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Carro msg1 = (Carro) context.getBean("Carro");
        
        System.out.println("Dados do carro");
        System.out.println("Nome" + msg1.getNome());
        System.out.println("Cor" + msg1.getCor());
        System.out.println("Marca" + msg1.getMarca());
        System.out.println("Ano" + msg1.getAno());
        System.out.println("========================");
        
        Certificado msg2 = (Certificado) context.getBean("Certificado");
        
        System.out.println("Dados do Certificado ");
        System.out.println("Nome " + msg2.getNome());
        System.out.println("Instituição " + msg2.getInstituicao());
        System.out.println("Documento" + msg2.getDocumento());
        System.out.println("Inicio" + msg2.getAnoDeInicio());
        System.out.println("COnclusão" + msg2.getAnoDeConclusao());
        System.out.println("========================");
        
        
        PessoaFisica obj = (PessoaFisica) context.getBean(PessoaFisica.class);
		System.out.println(obj.ler());
		
	
    }
}
