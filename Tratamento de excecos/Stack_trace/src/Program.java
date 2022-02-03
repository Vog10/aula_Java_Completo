import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		// chamando o metodo 1
	method1();
		
		// continuacao do programa
		System.out.println("End of program");

	
		}
	
	public static void method1() {
		
		System.out.println("***METHOD1 START***");
		/// chmando o metodo 2
		method2();
		
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		
		System.out.println(" ***METHOD2 START***");
		Scanner vogin  =  new Scanner(System.in);
		
		// tramento no bloco de codigo onde pode gerar a excecao
		try {
			// criando vetor // onde recebe uma entrada em split baseado em espaco branco
			String[] vect = vogin.nextLine().split(" ");
			
			// declarando uma variavel 
			int position = vogin.nextInt();
			
			// imprimindo na tela a posicao que foi informada
			System.out.println(vect[position]);
		}
		// capturando a mensagem de erro dando a continuidade a execucao do programa 
		 catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position!");
				
				// vai imprimir na tela o rastreamento so stack
				e.printStackTrace();
				vogin.next();
		 }
			catch (InputMismatchException e) {
				System.out.println("input error");
			}
	
		System.out.println("***METHOD2 END***");
		vogin.close();
	}
	
	
}
