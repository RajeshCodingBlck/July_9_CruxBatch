package Stack_question;

import java.util.Stack;

public class Reverse_the_stack {
    
public static void Insert_At_bottom(Stack<Integer> s, int val) {
		
		if(s.size()==0) {
			
			s.push(val);
			return ;
		}
		 
		int top_ele= s.pop();
		Insert_At_bottom(s, val);
		
		s.push(top_ele);
		
		
	}
	public static void reverse(Stack<Integer> s) {
		 
		if(s.size()==0) {
			return ;
		}
		
		int top_ele= s.pop();
		reverse(s);
		Insert_At_bottom(s, top_ele);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<Integer>();
		  
		  s.push(1);
		  s.push(2);
		  s.push(3);
		  s.push(4);
		  s.push(5);
		  
		  System.out.println(s);
		  reverse(s);
		  
		  System.out.println(s);
	}

}
