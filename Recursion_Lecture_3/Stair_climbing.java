package Recursion_Lecture_3;

public class Stair_climbing {
   
	public static int Print(int n, String path) {
		
		if(n==0) { // +ve Base Case
			System.out.println(path);
			return 1;
		}
		
		if(n<0) { // -Ve Base
			
			
			return 0;
		}
		
		int ans1=Print(n-1, path+"1");
		 int ans2=Print(n-2,path+"2");
		 
		 return ans1+ans2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int ans=Print(4,"");
		
		System.out.println();
		System.out.println(ans);
	}

}
