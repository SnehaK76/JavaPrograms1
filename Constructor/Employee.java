
public class Employee{
	
	int id;
	String name;
	String department;
	
	public Employee(){	
	}
	
	public Employee(int id){
		this.id = id;
	}
	
	public Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, String department){
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.id = 56;
		e1.name = "Sneha";
		e1.department = "IT";
		
		System.out.println("e1 id: "+e1.id);
		System.out.println("e1 name :"+e1.name);
		System.out.println("e1 department :"+e1.department);
		
		Employee e2 = new Employee(22);
		
		System.out.println("e2 id: "+e2.id);
		System.out.println("e2 name :"+e2.name);
		System.out.println("e2 department :"+e2.department);
		
		Employee e3 = new Employee(39, "Akshay");
	
		System.out.println("e3 d: "+e3.id);
		System.out.println("e3 name: "+e3.name);
		System.out.println("e3 department :"+e3.department);
		
		Employee e4 = new Employee(45, "Hrida", "Design");
		
		System.out.println("e4 d: "+e4.id);
		System.out.println("e4 name: "+e4.name);
		System.out.println("e4 department :"+e4.department);
		
		
	}
}