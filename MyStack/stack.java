package MyStack;

public class stack {
      
	 private int [] data;
	 private  int top;
	 
	 private int size;
	 
	 stack(int cap){
		
		 data= new int[cap];
		 top=0;
		 size=0;
		 
	 }
	 stack(){
		 
		 data= new int[5];
		 top=0;
		 size=0; 
	 }
	 
	 public int getSize() {
		 
		 return size;
	 }
	 
	 public boolean IsEmpty() {
		 
		 return size==0;
	 }
	 
	 public boolean IsFull() {
		 
		 return size==data.length;
	 }
	 
	 public void push(int val) throws Exception {
		 
		 if(IsFull()==true) {
			throw new Exception("Bhai Pagal Ho Gaya kya Stack full ho chuka he");
			
		 }
		 data[top]=val;
		 top=top+1;
		 size++;
		 
	 }
	 
	 public int peek()  throws Exception {
		 
		 if(IsEmpty()==true) {
			 throw  new Exception("Stack is underflow");
			 
		 }
		  
		 int result= data[top-1];
		 
		 return result;
		 
	 }
	 
	 
	 public int pop() throws Exception {
		 
		 if(IsEmpty()==true) {
			 throw  new Exception("Stack is Underflow");
			
			
			 
		 }
		 int result= peek();
		 
		   top--;
		   size--;
		   return result;
	 }
	 
	 
	 
	 
	
	 
}
