package path;

import java.io.File;
import java.util.Scanner;

public class InformaçõesCaminhoDoArquivo {

	public static void main(String[] args) {

		Scanner vogin = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = vogin.nextLine();

		File path = new File(strPath);

		// pegando nome do arquivo com a funcao getName
		System.out.println("getName: " + path.getName());
		// pegando o caminho do arquivo com a funcao getParents
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath()); // todo o caminho

		vogin.close();
	}

}
