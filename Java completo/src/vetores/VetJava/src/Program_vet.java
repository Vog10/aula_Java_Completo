import java.util.Locale;
import java.util.Scanner;

public class Program_vet {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner vogin = new Scanner(System.in);

		// VARIAVEL DE QUANTIDADE DE VETORES
		System.out.println("digite o tamanho do vetor");
		int n = vogin.nextInt();

		// CRIANDO UM VETOR
		double[] vect = new double[n]; // n É IGUAL O NUMERO DE POSIÇOES n

		// ACESSNADO O VETOR E ARMAZENANDO DADOS
		for (int i = 0; i < n; i++) {

			System.out.print("digite o valor: ");
			vect[i] = vogin.nextDouble();
		}

		/*
		 * IMPRIMINDO VALORES NA TELA for (int i = 0; i < n; i++) {
		 * 
		 * System.out.println("valores digitados: " + vect[i]);
		 * 
		 * }
		 */

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double media = sum / n;
		
		System.out.println("Media é = " + media);
		
		
		vogin.close();
	}

}
