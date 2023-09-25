package Lec20;

public class array_sum {
    public static int sumOfArray(int [] arr, int i) {
    	
    	   if(i==arr.length) {
    		   
    		   return 0;
    	   }
    	   int chhota_ans=sumOfArray(arr, i+1);
    	   
    	   int mera_ans= arr[i]+chhota_ans;
    	   
    	   return mera_ans;
    	      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int [] arr= {1,2,3,4,5};
      System.out.println(sumOfArray(arr,0));
	}

}
