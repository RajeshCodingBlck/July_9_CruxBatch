package Recursion_4;

public class River_Problem {

	public static void River(int n, int curr, String ans) {
		
		if(n==curr) { // +ve Base Case
			System.out.println(ans);
			return ;
		}
		
		if(curr>n) { // -ve Base
			return ;
		}
		
		for(int i=1; i<=6; i++) {
			River(n, curr+i, ans+i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		River(6, 0,"");
	}

}
