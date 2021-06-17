import java.util.Locale;
import java.util.Scanner;

public class Problema_mediaPonde_Uri_1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner vog = new Scanner(System.in);

		double a = vog.nextDouble();
		double b = vog.nextDouble();
		double c = vog.nextDouble();
		
		double media = ( a * 2.0 + b * 3.0 + c * 5) / 10;
		
		System.out.printf("MEDIA = %.1f\n ", media);

	
		vog.close();
	}

}
