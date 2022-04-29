package path;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {
	
	
		Scanner vogin = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = vogin.nextLine();
		
		File path = new File(strPath);
		
		// Criando o vetor File para fazer uma chamada so em directory "PASTAS"
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			
			System.out.println(folder);
		}
	
		// Criando o vetor File para fazer uma chamada so em arquivos do directory criando uma lista
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		
		// Criando uma subpasta
		
		boolean success = new File(strPath  + "//pasta").mkdir();
		System.out.println("Directory created successfully: " + success );
		
		vogin.close();
	}

}
