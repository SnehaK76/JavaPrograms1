
public class ReturnTypeMethod2{
	
	public int addition(int a, int b){
		System.out.println("Addition Method started");
		int res = a + b;
		System.out.println("Addition Method Ended");
		return res;
	}
	
	public int square(int num){
		System.out.println("Square Method started");
		int res = num * num;
		System.out.println("Square Method Ended");
		return res;
	}
	
	public static void main(String[] args){
		System.out.println("Main Method started");
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();
		int additionRes = obj.addition(39, 57);
		System.out.println("Addition result is :"+additionRes);
		int squareRes = obj.square(41);
		System.out.println("Square result is :"+squareRes);
		System.out.println("Main Method Ended");
	}
}