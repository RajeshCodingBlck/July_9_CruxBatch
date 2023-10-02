import java.util.*;
public class Main {
    public static void main (String args[]) {
     
       Scanner s= new Scanner(System.in);

        int n= s.nextInt();

        int [] arr= new int[n];

        for(int i=0; i<n;i++){

            arr[i]=s.nextInt();
        }

        Arrays.sort(arr);

        int count=1;

        int count_ofMajority_element=0;

        for(int i=1; i<n;i++ ){

             if(arr[i]==arr[i-1]){
                 count++;
             }else{

                 if(count> (n/3)){
                     System.out.print(arr[i-1]+" ");
                     count_ofMajority_element++;
                 }

                 count=1;

             }
        }

        if(count>n/3){
            System.out.print(arr[n-1]+" ");
            count_ofMajority_element++;
        }

        if(count_ofMajority_element==0){
            System.out.print("No Majority Elements");
        }



    }
}
