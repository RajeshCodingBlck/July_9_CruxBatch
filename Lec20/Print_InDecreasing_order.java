package Lec20;

public class Print_InDecreasing_order {
   
	public static void printIn(int n) {
		
		if(n==0) {
			return ;
			
		}
		
		 printIn(n-1);
		 System.out.println(n);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		print(5);
	}

}
