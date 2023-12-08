package MyStack;

public class stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      
		 stack myst= new stack();
		 
		 myst.push(10);
		 myst.push(20);
		 myst.push(30);
		 myst.push(40);
		 myst.push(60);
		 myst.push(70);
		 
		 System.out.println(myst.pop());
		 System.out.println(myst.peek());
		 System.out.println(myst.pop());
		 System.out.println(myst.pop());
		 System.out.println(myst.pop());
		 
//		 System.out.println(myst.IsEmpty());
		 
		 int [] arr=new int [3];
		 
		 System.out.println(arr[1]);
		 
		 
		 
		 
	}

}
