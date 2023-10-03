import java.util.*;
public class Main {
    public static int Min_kadens(int [] arr, int n){

        int minsum=Integer.MAX_VALUE;

        int sum=0;

        for(int i=0; i<n;i++){

            sum+=arr[i];

            minsum=Math.min(sum, minsum);

            if(sum>0){
                sum=0;
            }
        }

        return minsum;
    }
    public static int Max_kadens(int [] arr, int n){

        int maxsum=Integer.MIN_VALUE;

        int sum=0;

        for(int i=0; i<n;i++){

            sum+=arr[i];

            maxsum=Math.max(sum, maxsum);

            if(sum<0){
                sum=0;
            }

        }

        return maxsum;
    }
    public static void main(String args[]) {
      
      Scanner s= new Scanner(System.in);

      int t= s.nextInt();

      while(t>0){

        int n= s.nextInt();

        int [] arr= new int[n];

        int total=0;

         for(int i=0; i<n;i++){

             arr[i]=s.nextInt();

             total+=arr[i];
         }

        int maxsum_of_linear= Max_kadens(arr, n);
        // System.out.println(maxsum_of_linear);
        int maxsum_of_circular= total- Min_kadens(arr, n);
        System.out.println(Math.max(maxsum_of_circular, 
                                    maxsum_of_linear));


          t--;
      }
    }
}
