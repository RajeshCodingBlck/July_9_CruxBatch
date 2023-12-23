package Hash_demo;

import java.util.HashMap;

public class HashMap_question {
    
	public static int find_Non_repeated(int [] arr, HashMap<Integer, Integer> hm) {
		
		
		for(int i=0; i<arr.length;i++) {
			
			  if(hm.containsKey(arr[i])==false) {
				  
				  hm.put(arr[i],1);
			  }else {
				  
				 int Old_fre= hm.get(arr[i]);
				 hm.put(arr[i], Old_fre+1);	 
			  }
			  
		}
		
		// for Each loop
		
		 for(Integer k : hm.keySet()) {
			 
			  if(hm.get(k)==1) {
				  return k;
			  }
		 }
		 
		 return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //     Key      value
      HashMap<Integer, Integer> m= new HashMap();
       
      int [] arr= {1,2,2,4,2,3,3,1};
      
        System.out.println(find_Non_repeated(arr, m));
        
      
	}

}
