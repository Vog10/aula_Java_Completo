package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio_for4 {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {

			fat = fat * i;
		}

		System.out.println(fat);
		vogin.close();
	}

}
