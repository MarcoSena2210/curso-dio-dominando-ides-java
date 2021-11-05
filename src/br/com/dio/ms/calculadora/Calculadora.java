package br.com.dio.ms.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int a,b;
		
		System.out.println("Digite o primeiro valor:");
		a= scan.nextInt();
		System.out.println("Digite o segundo valor:");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		System.out.println("Soma : " + soma );
		
		int subtracao = subtracao(a,b);	
		System.out.println("Subtracao : " + subtracao);
		
		float multiplicacao = multiplicacao(a,b);
		System.out.println("Multiplcacao : " + multiplicacao);
		
		float divisao = divisao(a,b);
		System.out.println("Divisão : " + divisao);	
		
	}
	
	
	public static int soma(int a,int b) {
		return a+b;
	}
	
	public static int subtracao(int a,int b ) {
		return a-b;
	}
	
	public static float divisao(float a, float b) {
		return a/b;
	}
	
	public static float multiplicacao(int a,int b) {
		return a*b;
	}
	

}
