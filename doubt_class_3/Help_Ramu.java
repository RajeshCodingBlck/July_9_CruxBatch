import java.util.*;
public class Main {
    public static int get_min_in_c1_c2(int [] arr, int n, int c1, int c2){

          int ans=0;

          for(int i=0; i<n;i++){
                                    
              int currmin= Math.min( c1*arr[i],c2);

              ans+= currmin;
          }

          return ans;
    }
    public static void main(String args[]) {
       
        Scanner s= new Scanner(System.in);

        int t= s.nextInt();

        while(t>0){

            int c1= s.nextInt();
            int c2= s.nextInt();
            int c3= s.nextInt();
            int c4= s.nextInt();

            int n=s.nextInt(); // No. of Rickshaws
            int m= s.nextInt();  // No . of Cabs

            int [] ricks= new int[n];
            int [] cabs=new int[m];

            for(int i=0; i<n;i++){
                ricks[i]=s.nextInt();// In ith rickshaw How much ride wants to Take Ramu
            }
            
            for(int i=0; i<m;i++){
                cabs[i]=s.nextInt();
            }

            int ans1= Math.min(get_min_in_c1_c2(ricks, n, c1, c2),c3);
            int ans2=  Math.min( get_min_in_c1_c2(cabs, m, c1, c2), c3);
           
            int fans= Math.min(ans1+ans2, c4);

            System.out.println(fans);
            t--;
        }
    }
}
