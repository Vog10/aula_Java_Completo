package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		// Criando uma arquivo a parti do caminho informado do local do pc
		System.out.println("Enter file path: ");
		String sourceFileStr = vogin.nextLine();

		// Instancinado o arquivo criado para funcao FILE
		File sourceFile = new File(sourceFileStr);

		// Recebendo o caminho do arquivo criando
		String sourceFolderStr = sourceFile.getParent(); // pegando o caminho do arquivo com a funcao getParents

		// Criando uma nova pasta de saida com sourceFolderStr que foi instanciado
		boolean success = new File(sourceFolderStr + "//out").mkdir();

		// Criando um novo arquivo na pasta que foi criada no success
		String targetFileStr = sourceFolderStr + "//out//sumary.csv";

		// metodo de leitura com Bloco_try_with_resources e try se caso houve Exception
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			// string para split
			String itemCsv = br.readLine();

			// while para add na minha list e instancia os products
			while (itemCsv != null) {

				// criando uma vetor de string para receber com a virgula como separador
				String[] fields = itemCsv.split(",");
				// alocando as variaveis na posicao de cada elemento do vetor string
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				// instanciado minha list de product que foi criada "objeto"
				list.add(new Product(name, price, quantity));

				// finalizando meu br.readLine

				itemCsv = br.readLine();
			}
				// escrevendo e atualizado o arquivo que foi criando na pasta out que é sumary.csv
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					// atualizado a list com a funcao total da classe entities								
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		}catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		vogin.close();
		
	}

}
