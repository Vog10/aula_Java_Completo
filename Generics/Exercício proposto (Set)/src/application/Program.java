package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		
		System.out.printf("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int number = sc.nextInt();
			a.add(number);

		}

		
		System.out.printf("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int number = sc.nextInt();
			b.add(number);

		}

		
		System.out.printf("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int a1 = sc.nextInt();
			c.add(a1);

		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println();
		System.out.println("Total students: " + total.size());
	}

}
