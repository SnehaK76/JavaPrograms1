
public class MethodDemo3{
	
	public void substraction(int a, int b){
		int result = a - b;
		System.out.println("Result is :"+result);
	}
	
	public static void main(String[] args){
		System.out.println("Main method started");
		MethodDemo3 obj1 = new MethodDemo3();
		obj1.substraction(469, 22);
		System.out.println("Main method Ended");
	}
}