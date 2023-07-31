package Lec7;

import java.util.Scanner;

public class AnyBase_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int b= s.nextInt();
		
		int ans=0;
		
		int mul=1;
		
		while(n>0) {
			
			int rem= n%10;
			
			 ans= ans+ rem*mul;
			
			mul=mul*b;
			n=n/10;
			
		}
		
		System.out.println(ans);

	}

}
