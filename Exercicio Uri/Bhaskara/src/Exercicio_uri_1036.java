import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1036 {

	public static void main(String[] args) {
		
		Scanner vogin = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		vogin.useLocale(Locale.US);
		
		
		double a = vogin.nextDouble();
		double b = vogin.nextDouble();
		double c = vogin.nextDouble();
		
		
		double delta = Math.pow(b,2) - 4 * a * c;
		
		
		if(a == 0 || delta < 0) {
			
			System.out.println("Impossivel calcular");
			
		}else {
			
			double r1 = (-b + Math.sqrt(delta)) / (2 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2 );
			
		}
		
		
		
		
		
	}

}
