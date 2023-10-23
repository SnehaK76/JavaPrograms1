
public class MethodDemo2{
	
	public static void addition(int a, int b){
		int result = a + b;
		System.out.println("Result : "+result);
	}
	
	public static void main(String[] args){
		System.out.println("Main method started");
		addition(90, 56);
		System.out.println("Main method Ended");
	}
}