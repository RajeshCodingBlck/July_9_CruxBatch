package Doubt_class_1;
import java.util.*;

public class PatternDoubleSidedArrow {
 
	 public static void main(String args[]) {

	        Scanner s= new Scanner(System.in);

	        int n= s.nextInt();

	        int row=1;

	        int nsp1=n-1;

	        int nsp2=-1;

	        int nst=1;

	        int rowvalL=1;

	        

	        while(row<=n){

	            // space1

	             int i=1;

	             while(i<=nsp1){
	                 System.out.print(" "+" ");
	                 i++;
	             }

	             // Left  star

	             int j=1;

	             int valL=rowvalL;

	             while(j<=nst){
	                 System.out.print(valL+" ");
	                 valL--;
	                 j++;
	             }

	             // space 2

	             int k=1;

	             while(k<=nsp2){
	                 System.out.print(" "+" ");
	                 k++;
	             }

	             // Right Star

	             int l=1;

	             int valR=1;

	             if(row==1 || row==n){
	                 l=2;
	             }

	             while(l<=nst){
	                 System.out.print(valR+" ");
	                 valR++;
	                 l++;
	             }

	             // preparation for next Row

	             if(row< (n/2)+1){
	                 nsp1-=2;
	                 nst++;
	                 nsp2+=2;
	                 rowvalL++;
	             }else{
	                 nsp1+=2;
	                 nst--;
	                 nsp2-=2;
	                 rowvalL--;
	             }

	               System.out.println();
	               row=row+1;
	        }


	    }
	 
}
