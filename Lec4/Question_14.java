package Lec4;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       
       int n= s.nextInt();
       
       int row=1;
       
       int nst=1;
       
       int nsp=n-1;
       
       while(row<= 2*n-1) {
    	   
    	   // space
    	   
    	   int j=1;
    	   
    	   while(j<=nsp) {
    		   
    		   System.out.print(" "+" ");
    		   j=j+1;
    	   }
    	   // star Print
    	 
    	   int i=1;
    	   
    	   while(i<=nst) {
    		   
    		   System.out.print("*"+" ");
    		   i=i+1;
    	   }
    	   
    	   
    	   // Preparation for Next Row
    	   
    	    if(row<n) {
    	    	nst=nst+1;
    	    	nsp=nsp-1;
    	    }else {
    	    	nst=nst-1;
    	    	nsp=nsp+1;
    	    }
    	    
    	    System.out.println();
    	    row= row+1;
    	   
       }
	}

}