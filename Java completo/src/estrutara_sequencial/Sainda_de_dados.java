package estrutara_sequencial;
import java.util.Locale;

public class Sainda_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US); // para usar o ponto como separado por padarão de linguagem EUA em vez do BRA que em virgula.
		
		int y = 32;
		double x = 26.5686;
		String nome = "Maria";
		double salario = 3.5000;
		int idade = 35;
		
		
			System.out.println(y);
			System.out.println(x);
			System.out.printf("%.2f%n",x); // imprimindo variavel com casas decimais formatada, para pula linha pode ser usar %n ou \n 
			System.out.println("hello word");
			System.out.println("bom dia!");
			System.out.println("Resultado = " + y + " Metros"); // Concatenando a variavel com elementos de escrita.
			System.out.printf("Resultado =  %.2f metros\n", x); // Concatenação tipada estilo Linguagem C.
			System.out.printf("%s tem %d anos e recebe R$ %.3f reais por mês\n", nome, idade,salario);
	}

}
