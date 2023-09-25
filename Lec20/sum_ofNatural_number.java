package Lec20;

public class sum_ofNatural_number {
   
	public static int sumofNaturalNumber(int n) {
		
		if(n==0) {
			return 0;
		}
		
		int chhota_ans=sumofNaturalNumber(n-1); // recursion 1+2+3.......n-1 
		
		int mera_ans= n+chhota_ans;
		
		return mera_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(sumofNaturalNumber(5));
	}

}
