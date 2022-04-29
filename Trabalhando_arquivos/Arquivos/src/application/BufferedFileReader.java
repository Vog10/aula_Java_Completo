package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {

	public static void main(String[] args) {
	
		String path = "/home//vog//Documentos//in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//sequência de leitura a partir do arquivo que tiver nesse caminho
			fr = new FileReader(path);
			/* Ele está associado a partir do FileReader. Ele é uma abstração maior. assim pego uma 
			string basica e transformo pra uma leitura rapida. */
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		finally {
			try {
			if( br != null) {
				br.close();
			}
			if( fr != null) {
				fr.close();
			}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
