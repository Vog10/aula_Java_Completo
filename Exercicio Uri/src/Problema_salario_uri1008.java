import java.util.Locale;
import java.util.Scanner;

public class Problema_salario_uri1008 {

	public static void main(String[] args) {
	

		Scanner vog = new Scanner(System.in);
		vog.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		
		int num_employee = vog.nextInt();
		int worked_hours = vog.nextInt();
		double hours_price = vog.nextDouble();
		
		double salary =   worked_hours * hours_price;
		
		System.out.println("NUMBER = " + num_employee);
		System.out.printf("SALARY = U$ %.2f\n",salary );
		
		
		vog.close();
	}

}
