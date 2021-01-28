package entities;

public class Product {
//OBJETOS DA CLASSE
	
	public String name;
	public double price;
	public int quantity;
	
	
	// O CONSTRUTOR PADRÃO
	public Product() {
		
	}
	
	// CONSTRUINDO O CONSTRUTOR
	
	public  Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	// SOBRECARGA "CONSTRUTOR COM UM CARGA A MAIS = SOBRECARGA"
	public  Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	// FUNÇOES "METODOS" DA DE CALCULO DA CLASSE
	public double totalValueInStock() {
		return price * quantity;
	}
		// FUNÇOES "METODOS"
	public void addProducts(int quantity) {

		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		
		this.quantity -= quantity;
	}
	// TO STRING!!!!
	public String toString() {

		return name 
				+ ", $ "
				+ String.format("%.2f", price)
				+ ",  "
				+ quantity
				+ " units Total: $ "
				+ String.format("%.2f",totalValueInStock());
	}
}
