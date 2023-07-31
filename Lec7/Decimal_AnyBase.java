package Lec7;

import java.util.Scanner;

public class Decimal_AnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int b= s.nextInt();
		
		int ans=0;
		
		int place_value=1;
		
		
		while(n >0) {
			
			int rem= n%b;
			
			ans= rem*place_value +ans;
			
			n=n/b;
			place_value= place_value*10;
			
		}
		
		System.out.println(ans);
	}

}
