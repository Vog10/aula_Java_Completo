package application;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			
			String s1 = vogin.next();
            int x = vogin.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
		}

		vogin.close();
	}

}
