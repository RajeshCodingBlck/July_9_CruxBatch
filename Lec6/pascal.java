package Lec6;
import java.util.*;
public class pascal {
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);

       int n= s.nextInt();

       int row=0;

       int nst=1;

       while(row<n){

           // Print Star

           int i=0;

           int ncr=1;

           while(i<nst){

               System.out.print(ncr+"\t");

               // Preparation for Next ncr
               ncr= (ncr*(row-i))/(i+1);
               i=i+1;
           }

           // Preparation for Next Row

           nst= nst+1;
           System.out.println();
           row=row+1;
       }
    }
}