package entities;

public class ProductRectangle {

	public double width;
	public double heigth;

	public double areaProuct() {
		return  width * heigth;
	
	}

	public double perimeterProduct() {
		return 2 * (width + heigth);
	}

	public double diagonalProduct() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
	}
	
	

}
