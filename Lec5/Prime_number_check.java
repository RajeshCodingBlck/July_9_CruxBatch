package Lec5;

import java.util.*;

public class Prime_number_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		
		int count=0;
		
		for(int i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				count++;
				break;
			}
		}
		
		if(count==1) {
			System.out.println("NoT prime");
		}else {
			System.out.println("Prime");
		}

	}

}
