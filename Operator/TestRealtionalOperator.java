
public class TestRealtionalOperator{
	
	public static void main(String[] args){
		
		int a = 5;
		int b = 10;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a += b;
		System.out.println("a += b :"+a);
		
		a -= b;
		System.out.println("a -= b :"+a);
		
		a *= b;
		System.out.println("a *= b :"+a);
		
		a /= b;
		System.out.println("a /= b :"+a);
		
		a %= b;
		System.out.println("a %= b :"+a);
	}
}