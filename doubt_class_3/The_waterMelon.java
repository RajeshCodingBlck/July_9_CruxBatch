import java.util.*;
public class Main {
    public static void main (String args[]) {
         Scanner s= new Scanner(System.in);

         int w= s.nextInt();

          if(w%2==1){ // w is odd
              System.out.println("NO");
          }else{
              
              if(w==2){
                  System.out.println("NO"); 
              }else{
                   System.out.println("YES");
              }
          }
    }
}
