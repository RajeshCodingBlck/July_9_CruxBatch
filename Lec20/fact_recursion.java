package Lec20;

public class fact_recursion {
   public static int fact(int n) {
	   
	   
	      if(n==0) { // Base Case for this Problem
	    	  return 1;
	      }
	  
	      int chhota_ans= fact(n-1); // recursion (n-1)!    
	      int mera_ans= n*chhota_ans;
	      return mera_ans;
	      
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(fact(5));
	}

}
