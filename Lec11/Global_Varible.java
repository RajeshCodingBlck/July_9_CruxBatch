package Lec11;

public class Global_Varible {
	
	 static int b=20;
	 
	public static void fun1() {
		
		int a=12;
		
		System.out.println(a);
		
		System.out.println(b);
		b=10;
		
	}
	
	public static void fun2() {
		
		int b=30;
		
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         fun1();
         fun2();
	}

}
