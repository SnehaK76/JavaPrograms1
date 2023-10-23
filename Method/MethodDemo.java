

public class MethodDemo{
	
	public static void print1(){
		System.out.println("Print1 method Started");
		System.out.println("Hi...!!!");
		print2();
		System.out.println("Print1 method Ended");
	}
	
	public static void print2(){
		System.out.println("Print2 method started");
		System.out.println("Hello...!!!");
		System.out.println("Print2 method Ended");
	}
	
	public static void main(String[] args){
		System.out.println("Main method started");
		print1();
		System.out.println("Main method Ended");
	}
}