import java.util.Locale;
import java.util.Scanner;

public class URI1001 {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);
		vogin.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		double n = 3.14159;
		double raio = vogin.nextDouble();
		double area = Math.pow(raio, 2) * n;
		
		
		System.out.printf("A=%.4f\n ", area);
		System.out.println();
		vogin.close();

	}

}
