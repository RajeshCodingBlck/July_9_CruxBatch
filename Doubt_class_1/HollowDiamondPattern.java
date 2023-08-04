package Doubt_class_1;
import java.util.*;
public class HollowDiamondPattern {
	 public static void main(String args[]) {
	        // Your Code Here

	        Scanner s= new Scanner(System.in);

	        int n=s.nextInt();

	        int row=1;

	        int nsp=-1;

	        int nst= (n/2)+1;

	        while(row<=n){

	            // left Star

	             int i=1;

	             while(i<= nst){
	                 System.out.print("*"+"\t");
	                 i++;
	             }

	             // Space Print

	             int j=1;

	             while(j<=nsp){

	                 System.out.print(" "+"\t");
	                 j++;
	             }

	             // Right Star

	             int k=1;

	             if(row==1 || row==n){
	                 k=2;
	             }

	             while(k<=nst){
	                 System.out.print("*"+"\t");
	                 k++;
	             }

	             // Preparation for Next Row

	             if(row< (n/2)+1){
	                 nst--;
	                 nsp+=2;
	             }else{
	                 nst++;
	                 nsp-=2;
	             }

	             System.out.println();
	             row=row+1;
	        }
	    }
}
