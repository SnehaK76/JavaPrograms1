
public class TerneryOperatorDemo{
	
	public static void main(String[] args){
		String result1 = null;
		int num = 542;
		
		if(num % 2 == 0){
			result1 = "Even Number!!";
		}else{
			result1 = "Odd Number!!";
		}
		
		System.out.println(result1);
		
		System.out.println("......................");
		
		String result = null;
		
		result =  (num % 2 == 0)? "Even Number..!!" : "odd Number..!!";
		
		System.out.println(result);
	}
}