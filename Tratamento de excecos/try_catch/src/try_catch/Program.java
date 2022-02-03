package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*-Bloco try 
		 contém o codigo que representa a execucao normal 
		 do trecho de codigo que pode acarretar em uma execucao. */
		
		/* -Bloco catch
		 * contem o codigo a ser executado caso uma excecao ocorra
		 *  deve ser especificado o tipo da exececao a ser tratada ( upcasting é permitido)
		 * */

		
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
				 }
			catch (InputMismatchException e) {
				System.out.println("input error");
			}
		 // continuacao do programa
		System.out.println("End of program");
		
		
		
		vogin.close();
		
		
		
	}

}
