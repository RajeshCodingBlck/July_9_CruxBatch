package Lec10;
import java.util.*;
public class ArraY_d1 {
	
	public static void display(int [] arr) {
		
        for(int i=0; i<5;i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		int  [] arr =new int [5];
		// Input  from User in Array...
		for(int i=0;i<5;i++) {
		
			arr[i]=s.nextInt();
			
		}
		// Print the array	
		display(arr);	
	}

}
