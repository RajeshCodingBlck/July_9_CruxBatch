package Stack_question;

import java.util.Stack;

public class Next_greater_element {

	public static int [] Next_greater(int [] arr) {
		
		
		int [] ans= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			 int val=-1;
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[j]>arr[i]) {
					val=arr[j];
					break;
				}
				
			}
			
			ans[i]=val;
		}
		
		return ans;
	}
	
	// Approach of Stack
	public static int [] Next_Greater2(int [] arr) {
		
		
		int [] ans= new int[arr.length];
		
		Stack<Integer> s= new Stack<>();
		
		
		for(int i=arr.length-1;i>=0;i--) {
			
			 
			while(s.size()>0 && s.peek()<=arr[i]) {
				
				s.pop();
			}
			
			if(s.size()==0) {
				ans[i]=-1;
			}else {
				ans[i]=s.peek();
			}
			
			s.push(arr[i]);
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	 int [] arr= {5,3,10,1,3,5,7};
	 
	 int [] ans= Next_Greater2(arr);
	 
	  for(int i=0; i<ans.length;i++) {
		  
		   System.out.print(ans[i]+" ");
	  }
	  
	  
	 
	}

}
