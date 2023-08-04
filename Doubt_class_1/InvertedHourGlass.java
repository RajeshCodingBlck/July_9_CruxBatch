package Doubt_class_1;
import java.util.*;

public class InvertedHourGlass {
	 public static void main(String args[]) {
	       Scanner s= new Scanner(System.in);

	       int n= s.nextInt();

	       int row=1;

	       int nst=1;
	       int nsp= 2*n-1;

	       int rowvalL=n;
	       int rowvalR=n;

	       while(row<=2*n+1){

	           //  Left star

	           int i=1;

	           int valL=rowvalL;

	           while(i<=nst){
	               System.out.print(valL+" ");
	               valL--;
	               i++;
	           }

	           // space

	           int j=1;

	           while(j<=nsp){

	               System.out.print(" "+" ");
	               j++;
	           }

	           // Right Star

	           int k=1;

	           int valR=rowvalR;

	           if(row==n+1){
	               k=2;
	               valR++;
	           }
	           while(k<=nst){

	               System.out.print(valR+" ");
	               valR++;
	               k++;
	           }

	           // Prepartion for Next Row

	            if(row<n+1){
	                 nst++;
	                nsp-=2;
	            rowvalR--;
	            }else{
	                 nst--;
	               nsp+=2;
	            rowvalR++;
	            }

	            System.out.println();

	            row=row+1;

	       }

	    }
}
