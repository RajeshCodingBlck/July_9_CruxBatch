package Time_complexity_2;

public class Questions {
	
	public static int fact(int n) {
		   
		   
	      if(n==0) { // Base Case for this Problem
	    	  return 1;
	      }
	  
	      int chhota_ans= fact(n-1); // recursion (n-1)!    
	      int mera_ans= n*chhota_ans;
	      return mera_ans;
	      
 }
	
	
	
	public static void Print(int n, String ans) {
		
		 if(n==0) {
			 System.out.println(ans);
			
			 return;
		 }
//		ans+="H";
		Print(n-1,ans+"H");
		Print(n-1, ans+"T");
		
	}  
	// Time complexity is O(2^n)

public static int fibo(int n) {
		
		if(n==0) {
			
			return 0;
		}
		if(n==1) {
			
			return 1;
		}
		int chhota_ans1= fibo(n-1);
		int chhota_ans2= fibo(n-2);
		int mera_ans= chhota_ans1+chhota_ans2;
		return mera_ans;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
   public static int LinearSearch(int [] arr, int val) {
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==val) {
				return i;
			}
		}
		
		return -1;
	}
   
   //  Time complexity is O(n)
   
   public static int Binary_Search(int [] arr, int val) {
		
		int low=0;
		
		int high=arr.length-1;
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==val) {
				return mid;
			}else if(arr[mid]>val) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return -1;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
	    int n=10000000;
	    
//		for(int i=n ; i>=1; i= i/2) {
//			
//			 System.out.println("hello");
//		}  
	     // Time Complexity is O(log n base 2)
	    
	 //   int i=1;
//		 
//		 while(i<=n) {
//			 
//			 System.out.println("hello");
//			 
//			  i*=2;
	         // i*=3;
//		 } 
//	      Time Complexity is O(log n base 6)
	    
//	    int i=1;
//		 
//		 while(i*i<=n) {
//			 
//			 System.out.println("hello");
//			 
//			  i+=1;
//		 }  Time Complexity is O( sqrt(n))
	    
	      
		
//		 int i=1;
//		 
//		 while(i<=n) {
//			 
//			 System.out.println("hello");
//			 
//			  i+=2;
//		 }
	    
//	    for(int i=1; i<=n;i++) {
//	    	
//	    	for(int j=1; j<=n; j+=i) {
//	    		
//	    		System.out.println("hello");
//	    	}
//	    }
		 
		 
		 
		 
		 
		 
	}

}
