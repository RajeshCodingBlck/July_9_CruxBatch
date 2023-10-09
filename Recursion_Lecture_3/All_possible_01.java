package Recursion_Lecture_3;

public class All_possible_01 {
    
	public static void PrintComb(int n, String ans) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		PrintComb(n-1, ans+"0");
		PrintComb(n-1, ans+"1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        
        PrintComb(n, "");
	}

}
