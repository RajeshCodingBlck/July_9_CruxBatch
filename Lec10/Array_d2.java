package Lec10;

import java.util.*;

public class Array_d2 {
	
	public static void display(int [] arr) {
		
		System.out.println("Array Size is"+ arr.length);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		int [] arr1=new int [5];
//		
//		int [] arr2=arr1;
//		
//		System.out.println(arr1);
//		System.out.println(arr2);
		
		Scanner s= new Scanner(System.in);
		
		int  size= s.nextInt();
		
		int [] arr=new int [size];
		
		for(int i=0; i<size;i++) {
			arr[i]= 10*(i+1);
		}
		
		display(arr);
		
		
		
	}

}
