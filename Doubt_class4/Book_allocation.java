import java.util.*;
public class Main {
   
    public static boolean Api_can_read(int [] arr, int n, int m,
	      int p){
       
	     int count=1;

		 int total_page=0;

		 for(int i=0;i<n;i++){
             
			  if(p<arr[i]){
				  return false;
			  }
            
			 if(total_page+ arr[i]<=p){
				 total_page+=arr[i];
			 }else{
				 count++;
				 total_page=arr[i];
			 }
		 }

		 if(count<=m){
			 return true;
		 }else{
			 return false;
		 }

	}
	public static int bs(int [] arr, int n, int m){


		int low=1;

		int high=(int)(1e9);

		int ans=0;

		while(low<=high){

			int mid= (low+high)/2;

			if(Api_can_read(arr, n, m, mid)==true){
				ans=mid;
				high=mid-1;
			}else{
				low=mid+1;
			}
		}

		return ans;
	}
    public static void main(String args[]) {

     Scanner s= new Scanner(System.in);

	  int t= s.nextInt();

	  while(t>0){

		  int n= s.nextInt();
		  int m= s.nextInt();

		  int [] arr= new int[n];

		  for(int i=0; i<n;i++){

			  arr[i]=s.nextInt();
		  }

		  int ans= bs(arr, n, m);

		  System.out.println(ans);
		  t--;
	  }
    }
}
