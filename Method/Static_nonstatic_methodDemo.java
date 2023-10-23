

public class Static_nonstatic_methodDemo{
	
	public void m1(){
		System.out.println("Inside m1() method");
	}
	
	public static void m2(){
		System.out.println("Inside m2() method");
	}
	
	public void m3(){
		System.out.println("Inside m3() method");
	}
	
	public static void main(String[] args){
		System.out.println("Main Method started");
		Static_nonstatic_methodDemo obj = new Static_nonstatic_methodDemo();
		obj.m1();
		m2();
		obj.m3();
		System.out.println("Main Method started");
	}
}