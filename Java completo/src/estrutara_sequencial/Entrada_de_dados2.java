package estrutara_sequencial;

import java.util.Scanner;

public class Entrada_de_dados2 {

	public static void main(String[] args) {
		// PARA LER ATÉ A QUEBRA DE LINHA
		
		Scanner vogin = new Scanner(System.in);
		
			String s1,s2,s3;
			int a;
			
			System.out.println("DIGITE OS DADOS: ");
			a = vogin.nextInt();
			vogin.nextLine(); // limpando o buffer, cosumindo quebrade linha pendente
			s1 = vogin.nextLine(); // lendo a variavel com espaço ex: ( maria silva )
			s2 = vogin.nextLine();
			s3 = vogin.nextLine();
			
			System.out.println("DADOS DIGITADOS: ");
			System.out.println(a);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		
	
		
		vogin.close();
	}

}
