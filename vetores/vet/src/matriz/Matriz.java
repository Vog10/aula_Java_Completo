package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		int n = vogin.nextInt();

		int[][] mat = new int[n][n];
		/*
		 * A matriz com a funcao length 
		 * for(int i = 0; i < mat.length; i++){ 
		 * 		for( int j = 0; j < mat[i].length ; i++){
		 * 
		 * 		}
			}
		 */
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				mat[i][j] = vogin.nextInt();
			}
		}

		System.out.println("Main diagonal:");
		for (int i = 0; i < n; i++) {

			System.out.print(mat[i][i] + " ");
		}

		System.out.println();

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {

					count++;
				}

			}
		}

		System.out.println("Negative numbers = " + count);

	}

}
