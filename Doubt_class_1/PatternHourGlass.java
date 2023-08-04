package Doubt_class_1;
import java.util.*;
public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s= new Scanner(System.in);
         
         int n= s.nextInt();
         
         int row=1;
         
         int nst=2*n+1;
         int nsp=0;
         int rowval=n;
         
         while(row<=2*n+1) {
        	 
        	 // space
        	 
        	  int i=1;
        	  
        	  while(i<=nsp) {
        		  System.out.print(" "+" ");
        		  i++;
        	  }
        	  
        	  // star
        	  
        	  int j=1;
        	  int val=rowval;
        	  
        	  while(j<=nst) {
        		  System.out.print(val+" ");
        		  if(j<(nst/2)+1) {
        			  val--;
        		  }else {
        			  val++;
        		  }
        		  j++;
        	  }
        	  
        	  if(row<(n+1)) {
        		  nst-=2;
        		  nsp++;
        		  rowval--;
        	  }else {
        		  nst+=2;
        		  nsp--;
        		  rowval++;
        	  }
        	  
        	  System.out.println();
        	  row++;
         }
         
         
	}

}
