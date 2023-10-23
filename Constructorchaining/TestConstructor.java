
public class TestConstructor{
	
	public static void main(String[] args){
		
		Student s = new Student();
		s.age = 34;
		s.height = 123;
		s.name = "SSS";
		s.weight = 45;
		s.roll = 93;
		
		System.out.println(s.age);
		System.out.println(s.height);
		System.out.println(s.name);
		System.out.println(s.weight);
		System.out.println(s.roll);
	}
	
//	   Student s2 = new Student(10, "Ram", 5, 56, 23);\//	   
	//	System.out.println(s2.age);
		//System.out.println(s2.height);
		//System.out.println(s2.weight);
		//System.out.println(s2.roll);
		//System.out.println(s2.name);
}