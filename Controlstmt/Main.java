
public class Main{
	public static void main(String[] args){
		double n1 = 4.7, n2 = 10.2, n3 = 8.3, largest;
		
		if(n1 > n2){
			if (n1 > n3){
				largest = n1;
			}else{
				largest = n3;
			}
		}else{
			if(n2 > n3){
				largest = n2;
			}else{
				largest = n3;
			}
		}
		System.out.println("Largest number is:"+largest);
	}
}
