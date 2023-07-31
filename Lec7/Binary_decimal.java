package Lec7;

import java.util.Scanner;

public class Binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int ans=0;
		
		int mul=1;
		
		while(n>0) {
			
			int rem= n%10;
			
			if(rem==1) {
				ans= ans+mul;
			}
			
			mul=mul*2;
			n=n/10;
			
		}
		
		System.out.println(ans);

	}

}
