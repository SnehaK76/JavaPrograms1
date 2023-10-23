
public class IfDemo2{
	
	public static void main(String[] args){
		
		int i = 66;
		
		if(iseven(i))
			System.out.println("Even");
		else
			System.out.println("Not even");
	}
	
	public static boolean iseven(int number){
		return number % 2 == 0? true: false;
	}
}