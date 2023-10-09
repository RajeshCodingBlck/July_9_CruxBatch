package Recursion_4;

public class TOH {
	
	
	public static void TOH(int n, char a, char b,char c) {
		
		if(n==0) {
			return;
		}
		
		TOH(n-1, a, c,b);
		System.out.println("Move the disk "+ n+" from "+ a+" to "+c);
		TOH(n-1, b,a,c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		TOH(3,'a','b','c');
		
	}

}
