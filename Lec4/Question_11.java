package Lec4;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Scanner s= new Scanner(System.in);
		 
		 int n= s.nextInt();
		 
		 int row=1;
		 
		 int nst=1;
		 int nsp=n-1;
		 
		
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
				 
				if(j%2==0) {
					System.out.print(" "+" ");
				}else {
					System.out.print("*"+" ");
				}
				
				 j=j+1;
			 }
			 
			 // Preparation for Next Row
			  nst=nst+2;
			  nsp= nsp-1;
			
			  System.out.println();
			 
			  row=row+1;
		 }
	}
}
