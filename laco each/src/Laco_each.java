
public class Laco_each {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex" };
		
		
		// laco for simples!!!
		for(int i = 0; i < vect.length; i++) {
			
			System.out.println(vect[i]);
		}
		
		
		System.out.println("--------------------------");
		System.out.println();
		
		// laco for each com collection
		for (String obj : vect) {
			
			System.out.println(obj);
			
		}
		
	}

}
