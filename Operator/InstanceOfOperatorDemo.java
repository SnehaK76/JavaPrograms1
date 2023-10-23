
public class InstanceOfOperatorDemo{
	
	public static void main(String[] args){
		
		String s = new String("Hello");
		StringBuffer s1 = new StringBuffer("Hii");
		StringBuilder s2 = new StringBuilder("HiiHello");
		
		dosomething(s2);
	}
	
	public static void dosomething(Object o){
		
		if(o instanceof String){
			System.out.println("Do some string operation");
		}else{
			System.out.println("It is not string");
		}
	}
}