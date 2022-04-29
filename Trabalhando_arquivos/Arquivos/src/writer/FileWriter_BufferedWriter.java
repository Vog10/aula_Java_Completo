package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// crianado vetor de string para criar novo arquivo
		 String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		 
		 String path = "/home//vog//Documentos//out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

}
