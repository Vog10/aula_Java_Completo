package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employee will be registered? ");
		int n = vogin.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = vogin.nextInt();
			System.out.print("Name: ");
			vogin.nextLine();
			String name = vogin.nextLine();
			System.out.print("Salary: ");
			Double salary = vogin.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);

		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = vogin.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("This id does not exist! ");
		} else {

			System.out.print("Enter the percentage: ");
			double percent = vogin.nextDouble();

			list.get(pos).increaseSalary(percent);

		}
		System.out.println();
		System.out.println("List of employee: ");
		for ( Employee emp : list) {
			
			System.out.println(emp);
		}
		
		
		vogin.close();
	}

	// funcao para encontra id correto do que digitado.
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id) {
				return i;
			}

		}

		return null;

	}

}
