
public class TestOperator{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		
		boolean res1 = (a < b) && (b > a);
		boolean res2 = (a > b) && (b > a);
		boolean res3 = (a < b) && (b < a);
		boolean res4 = (a > b) && (b < a);
		
		boolean res5 = !(a > b);
		
		System.out.println(res5);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}