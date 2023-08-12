package Lec10;

import java.util.Scanner;

public class Array_demo1 {
    
	public static int squar(int x) {
		
		int ans= x*x;
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		 int x= s.nextInt();
		 
		 int ans= squar(x);
		 
		 System.out.println(ans);
	}

}
