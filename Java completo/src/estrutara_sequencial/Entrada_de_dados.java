package estrutara_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner vogin = new Scanner(System.in);
	
		String x;
		 
		// variaveis do tipo strings
		System.out.println("DIGITE UMA PALAVRA: ");
		x = vogin.next(); // lendo variaveis do tipo strings.
		System.out.println("palavra digitada foi: " + x);
		
		// variaveis do tipo INT como exemplo
		
		int y;
		System.out.println("DIGITE UM VALOR: ");
		y = vogin.nextInt(); // variavel int assim são para demais 
		System.out.println("VALOR DIGITADOR FOI: " + y);
		
		// variaveis do tipo double
		
		double z;
		System.out.println("DIGITE UMA VALOR DE NUMERO REAL: ");
		z = vogin.nextDouble();
		System.out.printf("VALOR DIGITADO FOI: %.2f",  z);
		
		// lendo caracteres 
		
		char a;
		System.out.println();
		System.out.println("DIGITE UM CARACTERES: ");
		a = vogin.next().charAt(0); // lembrando que só ler apenas um caractere se digita dois,so ler apenas o primeiro digitado
		System.out.println("CARACTERES DIGITADO: " + a);
		
		
		vogin.close();
	}

}
