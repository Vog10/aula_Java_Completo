package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkeLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departmentName = vogin.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = vogin.nextLine();
		System.out.print("Level: ");
		String workerLevel = vogin.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = vogin.nextDouble();
		
		// instanciando os objetos criados com suas respectivas classes (Classe Worker)
		Worker worker = new Worker(workerName, WorkeLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println("How many contracts to this worker? ");
		int n = vogin.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date  contractDate = sdf.parse(vogin.next());
			System.out.print("Value per hour: ");
			double valuePerHour = vogin.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = vogin.nextInt();
			
			// instanciando os objetos criados com suas respectivas classes (classe HourContract)
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			// associando contract com a classe Worker
			worker.addContract(contract);
		}
		
		System.out.println("");										//0,2///3	
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		// recortando o String manualmente (MM/YYYY), passando a string para uma varaviel int.  
		String monthAndYear = vogin.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); //passando para int // recortando.
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		vogin.close();
	}

}
