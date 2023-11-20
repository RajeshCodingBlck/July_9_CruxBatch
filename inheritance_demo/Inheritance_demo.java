package inheritance_demo;

public class Inheritance_demo {
   
	public static int sum(int a, double b) {
		
		 return a+b;
	}
	
	public static double sum(double a, double b) {
		
		return a+b;
	}
	
	public static   void sum(double a , int b) {
		
		
	}
	
	public static void sum(int ... a) {
		
		  System.out.println(a);
		
		  for(int i=0; i<a.length;i++) {
			  
			  System.out.println(a[i]);
		  }
	}
	
	public static void get(int n) {
		
		 System.out.println("1 is called");
	}
	
	
	public static void get(Integer n) {
		
		 System.out.println("2 is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 A obj1= new B();
		 
//		 B obj= new A(); // Error

		 
		 //sum(1,2,3,4,5);
		 
		 get(5);
		 
		 
		 
		 
		 

		 
		 
	}

}
