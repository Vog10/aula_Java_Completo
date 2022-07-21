package entities;
					  // Implementado O comparable na classe	
public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;

	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override // metodo compateTo serve para compara um objeto com outro
	public int compareTo(Employee other) {
		
		return  name.compareTo(other.getName());
	}
	
	
	
	
	
}
