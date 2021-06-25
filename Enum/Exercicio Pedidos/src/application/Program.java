package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner vogin = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = vogin.nextLine();
		System.out.print("Email: ");
		String email = vogin.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(vogin.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter oerder data:");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(vogin.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("how many items to this order? ");
		int n = vogin.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			vogin.nextLine();
			String productName = vogin.nextLine();
			System.out.print("Product price: ");
			double productPrice = vogin.nextDouble();
			System.out.print("Quantity: ");
			int quantity = vogin.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem it = new OrderItem(quantity, productPrice, product);

			order.addItem(it);

		}

		System.out.println();
		System.out.println(order);
		
		
		
		vogin.close();
	}

}
