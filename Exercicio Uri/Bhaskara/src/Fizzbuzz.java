import java.util.Locale;
import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {

		int x = 3;
		int y = 5;
		int n = 15;
		for (int i = 1; i <= n; i++) {

			if (i % x == 0 && i  % y == 0 ) {
		
				System.out.println("FizzBuzz");
			}else {
				if (i % x == 0) {
				System.out.println("Fizz");
			} else {
				if(i % y == 0 ) {
					System.out.println("Buzz");	
				}else {
					System.out.println(i);
				}
			
				}
			}
		}

	}

}
