package Doubt_class_1;
import java.util.*;
public class PatternMountain {
	 public static void main(String args[]) {
	       Scanner s= new Scanner(System.in);

	       int n= s.nextInt();

	       int row=1;

	       int nst=1;
	       int nsp= 2*n-3;

	       int rowvalL=1;
	       int rowvalR=1;

	       while(row<=n){

	           //  Left star

	           int i=1;

	           int valL=1;

	           while(i<=nst){
	               System.out.print(valL+"\t");
	               valL++;
	               i++;
	           }

	           // space

	           int j=1;

	           while(j<=nsp){

	               System.out.print(" "+"\t");
	               j++;
	           }

	           // Right Star

	           int k=1;

	           int valR=rowvalR;

	           if(row==n){
	               k=2;
	               valR--;
	           }
	           while(k<=nst){

	               System.out.print(valR+"\t");
	               valR--;
	               k++;
	           }

	           // Prepartion for Next Row

	            nst++;
	            nsp-=2;
	            rowvalR++;

	            System.out.println();

	            row=row+1;

	       }

	    }
	 
}
