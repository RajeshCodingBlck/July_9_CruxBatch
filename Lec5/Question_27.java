package Lec5;

import java.util.*;

public class Question_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		int val=row;
		while(row<=n) {
			
			// Print Space
			
			int i=1;
			
			while(i<= nsp) {
				
				System.out.print(" "+" ");
				i=i+1;
			}
			
			// Star Print
			
			int j=1;
			
			
			
			while(j<= nst) {
				
				
				System.out.print(val+" ");
				
				if(j< (nst/2)+1) {
					val=val+1;
				}else {
					val=val-1;
				}
				
				j=j+1;
			}
			
			// Preparation for the Next Row
			 
			nsp=nsp-1;
			nst= nst+2;
			System.out.println();
			row=row+1;
		}

	}

}
