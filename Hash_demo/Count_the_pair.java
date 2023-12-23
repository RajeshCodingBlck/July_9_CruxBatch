package Hash_demo;

import java.util.HashMap;

public class Count_the_pair {
    
	public static int Count_Pair(int [] arr) {
		
		 HashMap<Integer, Integer> m= new HashMap<>();
		 
		 for(int i=0; i<arr.length;i++) {
			 
			   if(m.containsKey(arr[i])) {
				  
				   int old_fre= m.get(arr[i]);
				   
				   m.put(arr[i], old_fre+1);
				   
			   }else {
				   
				   m.put(arr[i],1);
			   }
		 }
		 
		 int ans=0;
		 
		 for(Integer k : m.keySet()) {
			 
			 int fre= m.get(k);
			 
			 ans += ((fre)*(fre-1))/2;
		 }
		 
		 
		 return ans;
		 
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      int [] arr= {1,1,1,1,2,2,3,3,4,5,4};
      
      
      System.out.println(Count_Pair(arr));
      
	}

}
