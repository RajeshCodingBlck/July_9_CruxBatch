package Stack_question;

import java.util.Stack;

public class Balance_parenthesis {
	
	public static boolean Is_balance(String str) {
		
		 Stack<Character> stck= new Stack<>();
	      
	      for(int i=0; i<str.length();i++) {
	    	  
	    	  
	    	  if(str.charAt(i)=='(') {
	    		  
	    		  stck.push('(');
	    	  }else {
	    		  
	    		  if(stck.size()==0) {
	    			  return false;
	    		  }
	    		  
	    		  stck.pop();
	    	  }
	      }
	      
	      if(stck.size()>0) {
	    	  
	    	  return false;
	      }else {
	    	  
	    	  return true;
	      }
	      
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="(((())))))()";
      
     System.out.println( Is_balance(str));
      

     }
}