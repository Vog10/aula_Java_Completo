package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bloco_try_with_resources {

	public static void main(String[] args) {
		String path = "/home//vog//Documentos//in.txt";
				
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
		
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		}
	}



