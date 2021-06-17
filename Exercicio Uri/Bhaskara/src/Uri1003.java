import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {

		

		Scanner vogin = new Scanner(System.in);
		vogin.useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		
		double pi = 3.14159;
		double raio = vogin.nextDouble();
		
		double valor = 4.0/3 * pi  * ( Math.pow(raio, 3) );
		
		System.out.printf("VOLUME = %.3f\n ",  valor);
		
		

		vogin.close();
	}

}
