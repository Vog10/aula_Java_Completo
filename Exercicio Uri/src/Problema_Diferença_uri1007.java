import java.util.Scanner;

public class Problema_Diferença_uri1007 {

	public static void main(String[] args) {
		Scanner vog = new Scanner(System.in);
		
		
		int a = vog.nextInt();
		int b = vog.nextInt();
		int c = vog.nextInt();
		int d = vog.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("DIFERENCA = " + diferenca);
		
		vog.close();
	}

}
