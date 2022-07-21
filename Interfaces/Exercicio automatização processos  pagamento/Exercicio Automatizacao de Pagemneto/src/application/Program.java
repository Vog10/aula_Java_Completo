package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

//import model.service.OnlinePaymentService;
//import model.service.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*
		 * Testando Servico OnlinePaymentService ps = new PaypalService(); UpCasting
		 * System.out.println(ps.paymentFee(200.00));
		 * System.out.println(ps.interest(200.00, 3));
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();

		// instaciando a classe contract "Criando os Objetos"
		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		Integer monhts = sc.nextInt();

		// instanciando os servicos
		ContractService cs = new ContractService(new PaypalService()); // Injeção de dependência

		cs.processContract(contract, monhts);
		
		
		System.out.println("Installments: ");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
			
		}
		

		sc.close();
	}

}
