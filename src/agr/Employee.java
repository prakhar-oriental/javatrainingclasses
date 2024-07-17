package agr;

public class Employee {
    String name;
    int id;
    String department;
	
	
	
	public Employee(String name2, int id2, String department2) {
		// TODO Auto-generated constructor stub
		this.name = name2;
		this.id = id2;
		this.department = department2;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
	}
    
    
}
