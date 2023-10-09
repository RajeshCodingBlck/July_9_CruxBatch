package Recursion_5;

public class Subset_sum {
    public static void PrintSum(int [] arr, int i, int k, int sum, String ans) {
    	
    	if(i==arr.length) {
    		
    		
    		if(sum<=k) {
    			System.out.println(ans);
    		}
    		
    		return;
    	}
    	
    	if(sum>k) {  // Part  of the BackTracking 
    		return;
    	}
    	
    	PrintSum(arr, i+1,k,sum+arr[i], ans+ arr[i]); //include 
    	PrintSum(arr, i+1,k,sum, ans);// Not include
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {5,4,3,2,1};
      
      PrintSum(arr, 0, 5, 0, "");
      
	}

}
