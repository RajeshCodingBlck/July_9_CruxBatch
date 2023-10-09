package Recursion_Lecture_3;

public class Tower_of_Hanaoi {
   
	public static void TOW(int n, char a, char b, char c) {
		
	    if(n==0) {
	    	return ;
	    }
		TOW(n-1, a,c, b);
	    System.out.println("Move the Disk "+ n+" from the "+ a+" to "+ c);
	    TOW(n-1, b,a, c);
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
