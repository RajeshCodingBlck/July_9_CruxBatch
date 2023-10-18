import java.util.*;
public class Main {

	public static boolean Api_can_made_Paratha(int [] arr, int n,
	            int P, int t){

           int count=0;

		   for(int i=0; i<n;i++){

			   int j=1; //  jth paratha
               int currtime=0;
			    while( currtime+ j*arr[i] <=t ){
					   count++;
					   currtime+=j*arr[i];
					   j++;
				}

		   }

		   if(count>=P){
			   return true;
		   }else{
			   return false;
		   }
	}
    public static void main(String args[]) {
      
	  Scanner s= new Scanner(System.in);

	  int P= s.nextInt();

	  int n= s.nextInt();

	  int [] arr= new int[n];

	  for(int i=0; i<n;i++){

		  arr[i]=s.nextInt();
	  }

	  int low=1;

	  int high= (int)(1e9);

	  int ans=-1;

	  while(low<=high){

		  int mid= (low+high)/2;

		  if(Api_can_made_Paratha(arr, n, P, mid)==true){
			  ans= mid;
			  high=mid-1;
		  }else{
			  low=mid+1;
		  }
	  }

	  System.out.println(ans);


    }
}
