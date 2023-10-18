import java.util.*;
public class Main {
	public static void bs(long n, int k){

      	long low=1;
		long  high=n;
	     long ans=0;

		while(low<=high){

			long mid= (low+high)/2;

			if(Math.pow(mid,k)<=n){
				ans=mid;
				low=mid+1;
			}else{
				high=mid-1;
			}
		}

		System.out.println(ans);	
	}
    public static void main(String args[]) {
        // Your Code Here

		Scanner s= new Scanner(System.in);
       

	    int t= s.nextInt();


		while(t>0){

			
		long n= s.nextLong();

		int k= s.nextInt();

	   bs(n, k);
	   t--;
		}       
	   
    }
}
