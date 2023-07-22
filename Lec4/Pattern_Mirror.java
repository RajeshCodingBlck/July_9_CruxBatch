package Lec4;

import java.util.*;

public class Pattern_Mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s= new Scanner(System.in);
      
      int n= s.nextInt();
      
      int row=1;
      int nst=n/2;
      
      int nsp=1;
      
      while(row<=n) {
    	  
    	  // star
    	  
    	  int i=1;
   	   
   	   while(i<=nst) {
   		   
   		   System.out.print("*"+" ");
   		   i=i+1;
   	   }
    	  
    	  
    	  // space
    	  
    	   int j=1;
    	   
    	   while(j<=nsp) {
    		   
    		   System.out.print(" "+" ");
    		   j++;
    	   }
    	   
    	   // star
    	   
           int k=1;
    	   
    	   while(k<=nst) {
    		   
    		   System.out.print("*"+" ");
    		   k=k+1;
    	   }
    	  
    	  
    	 
    	   
    	   // Preparation for the next Row
    	   
    	   if(row<(n/2)+1) {
    		   nsp=nsp+2;
    		   nst=nst-1;
    	   }else {
    		   nsp=nsp-2;
    		   nst=nst+1;
    	   }
    	   
    	   System.out.println();
    	   
    	   row= row+1;  
      }
	}

}
