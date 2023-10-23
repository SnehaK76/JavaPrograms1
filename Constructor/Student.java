
public class Student{
	
	int roll;
	String name;
	String address;
	
	public static void main(String[] args){
		
		Student s1 = new Student();
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		s1.roll = 56;
		s1.name = "Sneha";
		s1.address = "Chichwad";
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.address);
		
		Student s2 = new Student();
		
		s2.roll = 22;
		s2.name = "Akshay";
		s2.address = "Pimple Gurav";
		
		System.out.println(s2.roll);
		System.out.println(s2.name);
		System.out.println(s2.address);
		
		Student s3 = new Student();
		
		s3.roll= 61;
		s3.name = "Snehakshay";
		s3.address = "Nigdi";
		
		System.out.println(s3.roll);
		System.out.println(s3.name);
		System.out.println(s3.address);
	}
}