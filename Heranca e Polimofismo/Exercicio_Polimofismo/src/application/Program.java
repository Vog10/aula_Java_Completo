package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();

		System.out.println("Enter the number of employees: ");
		int n = vogin.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + " data");
			System.out.print("outsourced (y/n)? ");
			char ch = vogin.next().charAt(0);
			System.out.print("Name: ");
			vogin.nextLine();
			String name = vogin.nextLine();
			System.out.print("Hours: ");
			int hours = vogin.nextInt();
			System.out.print("value per hour: ");
			Double valuePerHour = vogin.nextDouble();

			if (ch == 'y') {

				System.out.print(" Additional charge: ");
				double additionalCharge = vogin.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);

			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);

			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " -  $" + String.format("%.2f", emp.payment()));

		}
		

		vogin.close();
	}

}
