
public class TestBlock extends Parent{
	
	static
	{
		System.out.println("Inside Static block-222 - Extended");
	}
	
	public TestBlock(){
		super();
		System.out.println("Inside TestBlock() no-args constructor");
	}
	
	{
		System.out.println("Inside instance block-111 - Extended");
	}
	
	static
	{
		System.out.println("Inside Static block-111 - Extended");
	
	}

	{
		System.out.println("Inside instance block-222 - Extended");
	}
	
	public static void printHello(){
		System.out.println("Inside printHello()");
	}
	
	public void printHi(){
		System.out.println("Inside printHi()");
	}
	public static void main(String[] args){
		
		System.out.println("Inside Main Method");
		
		TestBlock obj = new TestBlock();
		
		printHello();
		obj.printHi();
		
	}
}