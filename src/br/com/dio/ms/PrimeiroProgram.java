package br.com.dio.ms;

import br.com.dio.ms.model.Gato;

public class PrimeiroProgram {

	public static void main(String[] args) {
		
		/*PARA 
		 * importar o package <CTRL+SHIFT+O > 
		 * */
		Gato gato = new Gato();
		/* Como está fora da classe PrimeiroProgram
		 * Não precisa importar
		 *  */
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
	
		int a= 5;
		int b= 8;
		System.out.println("Helllo mundo " + (a+b)); 
	}
}

class Livro{
	String nome;
	Integer numeroPagina; 
} 