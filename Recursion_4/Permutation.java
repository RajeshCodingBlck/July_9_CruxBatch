package Recursion_4;

public class Permutation {
  
	public static void Permutation(String ques, String ans) {
		                          // abcdef
		
		if(ques.length()==0) {
			
			System.out.println(ans);
			return;
		}
		
	    
	   for(int i=0; i<ques.length();i++) {
		   
		   String left_string=ques.substring(0,i);
		   String right_string= ques.substring(i+1);
		    char ch= ques.charAt(i);
		    
		    boolean flag= true;
		    
		    for(int j=i+1;j<ques.length();j++) {
		    	
		    	if(ch== ques.charAt(j)) {
		    		flag=false;
		    		break;
		    	}
		    }
		    
		    
		    if(flag==true) {
		    	 Permutation(left_string+right_string, ans+ch);  
		    }
	   }
	   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation("aac", "");
	}

}
