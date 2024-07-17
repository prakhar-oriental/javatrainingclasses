package agr;

public class Department {
	String name;
    int noemployee;
    Employee arr[];
	public Department(String name, int noemployee, Employee[] arr) {
		super();
		this.name = name;
		this.noemployee = noemployee;
		this.arr = new Employee[noemployee];
	}
	
	

}
