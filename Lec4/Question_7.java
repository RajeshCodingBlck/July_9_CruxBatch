package Lec4;

import java.util.*;

public class Question_7 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		
		while(row<=n) {
			
			
			if(row==1 || row==n) {
				
				int i=1;
				
				while(i<=n) {
					System.out.print("*"+" ");
					i++;
				}
			}else {
				
				 System.out.print("*"+" ");
				 
				 // space Print
				 int i=1;
				 
				 while(i<= n-2) {
					 
					 System.out.print(" "+" ");
					 i++;
				 }
				 
				 System.out.print("*"+" ");
				 
			}
			
			// Preparation for Next Row
			 row=row+1;
			 System.out.println();
		}
		

	}

}
