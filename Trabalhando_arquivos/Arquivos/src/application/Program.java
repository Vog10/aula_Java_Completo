package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/* Com isso aqui a gente instancia o objeto do tipo file, e esse objeto vai
		 * encapsulartodo o processo de acessar o arquivo e caminho do arquivoexception
		 * LINUX É BARRA // 
		 */
		File file = new File("/home//vog//Documentos//in.txt");
		Scanner vogin = null;
	// Obrigarado colocar dentro de try por causa do IOexception
		try {
			
			
			vogin = new Scanner(file);
			// testa se ainda nova linha no arquivo.
			while(vogin.hasNextLine()) {
				System.out.println(vogin.nextLine());
			}
			
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		// Recurso finally vai fecha, independete se try deu certo ou nao. 
		finally {
			
			// se scanner for diferente de null ai sim pode se fechado
			if(vogin != null) {
			vogin.close();
			}
		}

	}

}
