package Lec7;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int ans=0;
		
		int place_value=1;
		
		
		while(n >0) {
			
			int rem= n%2;
			
			ans= rem*place_value +ans;
			
			n=n/2;
			place_value= place_value*10;
			
		}
		
		System.out.println(ans);

	}

}
