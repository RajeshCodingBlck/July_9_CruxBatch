package Stack_question;
import java.util.*;

public class Insert_At_the_Bottom {
   
	public static void Insert_At_bottom(Stack<Integer> s, int val) {
		
		if(s.size()==0) {
			
			s.push(val);
			return ;
		}
		 
		int top_ele= s.pop();
		Insert_At_bottom(s, val);
		
		s.push(top_ele);
		
		
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
		  Insert_At_bottom(s, 10);
		  
		  System.out.println(s);
		  
		  
		  
		  
	}

}
