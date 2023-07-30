package Lec6;
import java.util.*;

public class pattern_assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s= new Scanner(System.in);
		 
		 int a= s.nextInt();
		 int b= s.nextInt();
		 
		 int min_value=-1;
		 
		 if(a<b) {
			 min_value=a;
		 }else {
			 min_value=b;
		 }
		 
		 // Special Case when a is zero
		 
		 if(a==0 || b==0) {
			
			 if(a!=0) {
				 System.out.println(a);
			 }else {
				 System.out.println(b);
			 }
			 
		 }
		 
		 int ans=0;
		 
		 for(int i=1; i<=min_value;i++) {
			 
			 if(a%i==0 && b%i==0) {
				 ans= i;
			 }
		 }
		 if(a!=0 && b!=0) {
			 System.out.println(ans);
		 }
		 

	}

}
