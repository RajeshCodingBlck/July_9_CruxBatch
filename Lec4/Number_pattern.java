package Lec4;

import java.util.*;

public class Number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner s= new Scanner(System.in);
		 
		 int n= s.nextInt();
		 
		 int row=1;
		 
		 int nst=1;
		 int nsp=n-1;
		 
		 int val=1;
		 while(row<=n) {
			 
			 // Space 
			 
			 int i=1;
			 
			 while(i<=nsp) {
				 
				 System.out.print(" "+" ");
				 i=i+1;
			 }
			 
			 // Star Print
			 
			 int j=1;
			 
			 while(j<=nst) {
				 
				System.out.print(val+" ");
				
				 j=j+1;
			 }
			 
			 // Preparation for Next Row
			  nst=nst+2;
			  nsp= nsp-1;
			
			  System.out.println();
			  val=val+1;
			  row=row+1;
		 }
	}

}
