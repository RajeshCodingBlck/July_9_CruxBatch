import java.util.*;
public class Main {
    public static void main (String args[]) {
       
       Scanner s= new Scanner(System.in);

       int t= s.nextInt();


       while(t>0){
            
         int x= s.nextInt();
         int n= s.nextInt();

         int rem_candies= x%n;

         int take_extra_candies= (n-rem_candies);

         int ans= Math.min(rem_candies, take_extra_candies);

         System.out.println(ans);

           t--;
       }

    }
}
