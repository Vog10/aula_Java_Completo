package estrutara_sequencial;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.  */ 
	
		Scanner vogin = new Scanner(System.in);
	
		int a,b, soma;
		char c;
	
		do {
		
	System.out.println("DIGITE OS NUMEROS PARA SOMA: ");
	a = vogin.nextInt();
	b = vogin.nextInt();
	
	soma = a + b;
	
	System.out.println("valor da soma = " + soma);
	System.out.println("deseja continuar s/n: ");
	c = vogin.next().charAt(0);
	
		}while( c != 'n');
	
		System.out.println("Wops Problema resolvido, Que bom! ");
		
	vogin.close();
	}

}
