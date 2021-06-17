import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// list e uma forma aprimorada de um vetor no java
		List<String> list = new ArrayList<>(); // arraylist e uma class que mistura o que a de bom no vetor com list

		// add um valor a variavel list que foi instanciada da class List
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		System.out.println("------Tamanho da list-------");
		list.add(2, "Marco"); // add novo elemento

		System.out.println(list.size()); // tamanho da list

		System.out.println("------Dados----------");

		// for each para testa se a list
		for (String x : list) {

			System.out.println(x);
		}

		System.out.println("------Removendo-------");

		// list.remove("Anna"); // removendo a parti de uma comparacao
		// list.remove(1); // removendo a parti da posicao
		list.removeIf(x -> x.charAt(0) == 'M'); // removendo pelo predicado "funcao lambida"

		// for each para percorre a list
		for (String x : list) {

			System.out.println(x);
		}
		System.out.println("------Posicao do elemento-------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // valor -1, pois nao exite na list

		System.out.println("------Dixando na list somente x elemento-------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// for each para percorre a list
		for (String x : result) {

			System.out.println(x);
		}

		System.out.println("------Encontrando primeiro  elemento a parti de um predicado  -------");
		String name =  list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);  
		String name1 =  list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null); /* find e para pega o elemento que esta
		no predicado orElse e para retorna nulo caso nao exista o valor que esta no predicado */
		
		System.out.println(name);
		System.out.println(name1);
		
	}

}
