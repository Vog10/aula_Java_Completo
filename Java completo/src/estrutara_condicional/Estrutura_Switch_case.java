package estrutara_condicional;

import java.util.Scanner;

public class Estrutura_Switch_case {

	public static void main(String[] args) {
		Scanner vogin = new Scanner(System.in);

		String dia;

		System.out.println("Digite o dia da semana de 1 a 7");
		int x = vogin.nextInt();

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "dia invalido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		vogin.close();
	}

}
