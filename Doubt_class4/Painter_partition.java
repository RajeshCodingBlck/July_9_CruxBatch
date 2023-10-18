import java.util.*;
public class Main {

	public static boolean Api_can_paint(int [] arr, int n, int k, int t){

		  int count=1;

		  int time_taken=0;

		  for(int i=0; i<n;i++){
            
			  if(t <arr[i]){
                  return false;
			  }
			 
			  if(time_taken+ arr[i]<=t){
				  time_taken+=arr[i];
			  }else{
				  count++;
				  time_taken=arr[i];
			  }
		  }

		  if(count>k){
			  return false;
		  }else{
			  return true;
		  }
	}
    public static void main(String args[]) {
      
	   Scanner s= new Scanner(System.in);

	   int k= s.nextInt();

	   int n= s.nextInt();

	   int [] arr= new int[n];


	   for(int i=0; i<n;i++){

		   arr[i]=s.nextInt();
	   }

	   int low=1;

	   int high=(int)1e9;

	   int ans=0;

	   while(low<=high){

		   int mid= (low+high)/2;

		   if(Api_can_paint(arr, n, k, mid)==true){
			   ans=mid;
			   high=mid-1;
		   }else{
			   low=mid+1;
		   }
	   }

	   System.out.println(ans);


    }
}
