

public class ReturnTypeMethod{
	
	public int sum(int x, int y){
		System.out.println("Sum Method started");
		int result = x + y;
		System.out.println("Sum Method ended");
		return result;
	}
	
	public static boolean isEvenNumber(int number){
		
		if(number %2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static void print(int number){
		System.out.println("Number is :"+number);
	}
	
	
	public static void main(String[] args){
		System.out.println("Main Method started");
		ReturnTypeMethod obj = new ReturnTypeMethod();
		int returnValue = obj.sum(65, 99);
		System.out.println("Addition is :"+returnValue);
		int number = 76;
		
		if(isEvenNumber(number)){
			print(number);
		}
		
		System.out.println("Main Method ended");
		
	}
}