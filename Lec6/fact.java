package Lec6;
import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner(System.in);
		 
		 int n= s.nextInt();
		 
		 int ans=1;
		 
		 for(int i=1; i<=n;i++) {
			 
			ans= ans*i;
		 }
		 
		 System.out.println(ans);
		 
	}

}
