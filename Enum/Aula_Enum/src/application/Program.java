package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		
		// criando objeto = instaciando uma variavel// transferido valores para obejto
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	   // imprimindo objeto 
		System.out.println(order);
	
		//criando objeto enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	
		//imprimindo objeto
		System.out.println(os1);
		System.out.println(os2);
	}

}
