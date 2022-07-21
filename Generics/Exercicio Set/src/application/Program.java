package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			
			while(line != null) {
				
				// recortando o arquivo 
				String[] fields = line.split(" ");
				//repassando o nome para posicao 0 do vetor
				String username = fields[0];
				//repassando a data para a posicao 1 do vetor
				Date moment = Date.from(Instant.parse(fields[1]));
				
				// instanciando Set com generic LogEntry
				set.add(new LogEntry(username, moment));
				
				line = br.readLine();
				
			}
			
			
			System.out.println("Total Users " + set.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();

	}

}
