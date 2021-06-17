package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner vogin = new Scanner(System.in);
		int N = vogin.nextInt();

//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (N > 2 && N <= 5) {
			if (N % 2 != 0) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		} else if (N >= 6 && N <= 20) {

			System.out.println("Weird");

		} else {
			System.out.println("Not Weird");

		}

		vogin.close();
	}

}
