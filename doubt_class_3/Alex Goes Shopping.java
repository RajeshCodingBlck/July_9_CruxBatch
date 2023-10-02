import java.util.*;
public class Main {
    public static void main(String args[]) {
      
       Scanner s= new Scanner(System.in);

       int n= s.nextInt(); // How Many items Shopkeeper have

       int [] arr= new int [n];

        for(int i=0; i<n;i++){

            arr[i]= s.nextInt();
        }

        int q= s.nextInt();


        while(q>0){

          int a= s.nextInt();
          int k= s.nextInt();

           int count=0;

           for(int i=0; i<n;i++){

               if(a % arr[i] ==0){
                    count++;
               }
           }

             if(count>=k){
                   System.out.println("Yes");
             }else{
                 System.out.println("No");
             }
            q--;
        }
    }
}
