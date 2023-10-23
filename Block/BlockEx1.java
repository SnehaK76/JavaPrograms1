
public class BlockEx1{
	
	public static void addition(int a, int b){
		int res = a + b;
		System.out.println("Addition of two number is :"+res);
	}
	
	{
		System.out.println("Inside instance block-111");
	}
	
	{
		System.out.println("Inside instance block-222");
	}
	
	public BlockEx1(){
		System.out.println("Inside no-args constructor");
	}
	
	public static void main(String[] args){
		
		System.out.println("Inside main method");
		
		addition(30, 56);
		BlockEx1 obj = new BlockEx1();
	}
}