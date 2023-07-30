package Lec6;
import java.util.*;
public class gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int divisor= s.nextInt();
		
		int dividend= s.nextInt();
		
		int multiple= divisor*dividend;
		
		
		if(divisor==0) {
			
			
			System.out.println(dividend);
			
			System.out.println("LCM is " +0);
			
		}else {
			

			while(dividend%divisor !=0) {
				
				int rem= dividend%divisor;
				dividend= divisor;
				divisor= rem;
			}
			
			System.out.println(divisor);
			
			System.out.println("LCM is "+ multiple/divisor);
		}
		
		
		
		

	}

}
