package Doubt_class_1;
import java.util.*;

public class PatternRhombus {

	public static void main(String args[]) {


        Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int row=1;

        int nst=1;
        int nsp=n-1;

        int rowval=1; // starting value of each row

        while(row<=2*n-1){

            // Space Print

            int i=1;

            while(i<=nsp){
                System.out.print(" "+"\t");
                i++;
            }

            // Star print

             int j=1;

             int val=rowval; // value for that particular row
             // aur isko column wise change karenge.

             while(j<=nst){
                 System.out.print(val+"\t");
                 if(j< (nst/2)+1){
                     val++;
                 }else{
                     val--;
                 }
                 j++;
             }

             // Preparation for Next Row

              if(row<n){
                  nst+=2;
                  nsp--;
                  rowval++;
              }else{
                  nst-=2;
                  nsp++;
                  rowval--;
              }

              System.out.println();
              row=row+1;
        }

    }
}
