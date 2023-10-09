package Recursion_5;

import java.util.ArrayList;

public class Group_sum_usingArrayList {
    public static void PrintGroup(int [] arr, int i, int sum1, int sum2, 
    		                     ArrayList<Integer> g1, ArrayList<Integer> g2, 
    		                     int total) {
    	if(i==arr.length) {
    		
    		if(sum1==sum2) {
    			System.out.println(g1+" "+g2);
    			
    		}
    		
    		return;
    	}
    	
    	if(sum1> total/2 || sum2>total/2) {
			return ;
		}
    	
    	
    	g1.add(arr[i]);
    	PrintGroup(arr, i+1, sum1+arr[i], sum2, g1, g2, total);
    	g1.remove(g1.size()-1);
    	g2.add(arr[i]);
    	PrintGroup(arr, i+1, sum1, sum2+arr[i], g1, g2, total);
    	g2.remove(g2.size()-1);
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {1,3,3,1,6};
	       
	       int total=0;
	       
	       for(int i=0; i<arr.length;i++) {
	    	   total+=arr[i];
	       }
	       
	       ArrayList<Integer> g1= new ArrayList<Integer>();
	       ArrayList<Integer> g2= new ArrayList<Integer>();
	       
	       
	       PrintGroup(arr, 0, 0,0,g1, g2, total);
	}

}
