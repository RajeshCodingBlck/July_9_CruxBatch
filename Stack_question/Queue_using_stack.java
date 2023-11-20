package Stack_question;

import java.util.Stack;

public class Queue_using_stack {
     
	Stack<Integer> stk;
	Queue_using_stack(){
		
		stk= new Stack<Integer>();
	}
	
	void push(int val) {
		
		stk.push(val);
	}
	
	 int pop()  throws Exception {
		
		if(stk.size()==0) {
			throw new Exception("Stack Is Empty");
		}
		
	  // reverse(stk);
	  // stk.pop();
	  // reverse(stk);
		
		return 0;
		
	}
	
	
	
	
}
