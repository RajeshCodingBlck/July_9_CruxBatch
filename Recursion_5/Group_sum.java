package Recursion_5;

import java.util.ArrayList;

public class Group_sum {
   
	public static void PrintGroup(int[] arr, int i,int sum1, int sum2, String g1,
			                                                           String g2, 
			                                                            int  total) {
		if(i==arr.length) {
			
		   if(sum1==sum2) {
				System.out.println(g1+" "+g2);
		   }
			return ;
		}
		
		if(sum1> total/2 || sum2>total/2) {
			return ;
		}
		
		PrintGroup(arr, i+1, sum1+arr[i], sum2, g1+arr[i], g2, total);
		PrintGroup(arr, i+1, sum1, sum2+arr[i], g1, g2+arr[i], total);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,3,3,1,6};
       
       int total=0;
       
       for(int i=0; i<arr.length;i++) {
    	   total+=arr[i];
       }
       
       
       PrintGroup(arr, 0, 0,0,"", "", total);
       
	}

}
