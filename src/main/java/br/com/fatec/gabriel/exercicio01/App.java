package br.com.fatec.gabriel.exercicio01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;






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
		
		Placa obj = (Placa) context.getBean(Placa.class);
		obj.setAno(200);
		System.out.println(obj.ler());
		
		System.out.println(obj.getAno());
	
    }
}
