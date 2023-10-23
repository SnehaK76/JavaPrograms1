
public class Student extends Person{
	
	int roll;
	String name;
	
	public Student(){
		super(10,23,56);
		this.roll = 77;
		this.name = "AAA";
	}
	
	public Student(int rn, String name){
		this(rn, nm, 4, 88, 45);
		this.roll = rn;
		this.name = nm;
	}
	
	public Student(int roll, String name, int age, int height, int weight){
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}