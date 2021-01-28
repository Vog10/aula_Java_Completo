package estrutura_repetitiva;

public class Funcoes_para_String {

	public static void main(String[] args) {

		String original = " abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase(); // formatando a STRING em minuscula.
		System.out.println("original = " + original);
		System.out.println("toloWerCase = " + s01); // lowercase ENGLISH = miniscula PORTUGUES.

		String s02 = original.toUpperCase(); // formanado a string em maiusculo

		System.out.println("original = " + original);
		System.out.println("toUpperCase = " + s02); // uppercase = maiuscula

		// trim serve para eliminar os espaços ex: - a, b - = -a,b-;

		// selecionando caracter para cria nova sequencia aparti dele
		String s03 = original.substring(2);
		System.out.println("original = " + original);
		System.out.println("substring (02) = " + s03);

		// recortando de um caracter ate outro caracter ex: 2 ate 8

		String s04 = original.substring(2, 9);
		System.out.println("original = " + original);
		System.out.println("substring (02,09) = " + s04);

		// troca de carecter por outro replace

		String s05 = original.replace('a', 'x');
		System.out.println("original = " + original);
		System.out.println("replace('a', 'x' = " + s05);

		// replace para substring

		String s06 = original.replace("abc", "xyw");
		System.out.println("original = " + original);
		System.out.println("replace('abc', 'wxy') =" + s06);

		// ocorrencia de caracter

		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
	}

}
