package Lec19;

import java.util.*;

public class ArrayList_in_java {
   public static void Reverse(ArrayList<Integer> arr) {
	   
	   int i=0;
	   int j= arr.size()-1;
	   
	   while(i<=j) {
		   
		   int temp= arr.get(i);
		   arr.set(i, arr.get(j));
		   arr.set(j,  temp);
		   i++;
		   j--;
	   }
	   
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> arr= new ArrayList();
        
        System.out.println(arr);
        
        arr.add(1);
        System.out.println(arr);
        
        arr.add(12);
        System.out.println(arr);
        
        arr.add(30);
        System.out.println(arr);
        // Range -> [0, size-1]
//        System.out.println(arr.get(3)); // Fetch the value from any index;
        arr.add(34);
        arr.set(3, 60); // [0, size-1]
        System.out.println(arr);
        
        arr.add(4,23); // index -> [0,size]
        
        System.out.println(arr);
        
        arr.remove(0);
        
        System.out.println(arr);
        
        arr.remove(Integer.valueOf(30));
        System.out.println(arr);
        
        Collections.sort(arr);
        System.out.println(arr);
//        Collections.reverse(arr);
        Reverse(arr);
        System.out.println(arr);
	}

}
