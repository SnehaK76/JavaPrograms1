
public class Person{
	
	String name;
	int height;
	float weight;
	
	public Person(){
		super();
	}
	
	public Person(String name, int height, float weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	public static void main(String[] args){
		
		Person p = new Person("Akshay", 170, 65.44);
		
		System.out.println(p.name);
		System.out.println(p.height);
		System.out.println(p.weight);
		
		Person p1 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		
	}
}