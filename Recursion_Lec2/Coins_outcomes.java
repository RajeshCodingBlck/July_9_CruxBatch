package Recursion_Lec2;

public class Coins_outcomes {
	
	static int count=0;
  
	public static void Print(int n, String ans) {
		
		 if(n==0) {
			 System.out.println(ans);
			 count++;
			 return;
		 }
//		ans+="H";
		Print(n-1,ans+"H");
		Print(n-1, ans+"T");
		
	}
	
	public static int Print2(int n, String ans) {
		
		 if(n==0) {
			 System.out.println(ans);
			 
			 return 1;
		 }
		int chhota_ans1=Print2(n-1,ans+"H");
		int chhota_ans2=Print2(n-1, ans+"T");
		
		return chhota_ans1+chhota_ans2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String ans="";
		Print(1,ans);
		
		System.out.println(ans);
//		System.out.println("hello");
//		
//		System.out.println(count);
		
//		System.out.println(Print2(3,""));
	}

}
