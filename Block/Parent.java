
public class Parent{
	{
		System.out.println("Inside instance block-111 - Parent");
	}
	
	public Parent(){
		super();
		System.out.println("Inside Parent() no args constructor!!!");
	}
	
	static 
	{
		System.out.println("Inside Static block-111 - Parent");
	}
}