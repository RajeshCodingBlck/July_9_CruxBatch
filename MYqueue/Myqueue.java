package MYqueue;

public class Myqueue {

	private int front;
	private int rear;
	private int [] data;
	
	Myqueue(){
		
		data=new int[5];
		front=-1;
		rear=-1;
		
	}
	
    Myqueue( int cap){
		
		data=new int[cap];
		front=-1;
		rear=-1;
		
	}
    
     public boolean IsEmpty() {
    	 
    	 if(front==-1 && rear==-1) {
    		 return true;
    	 }
    	 return false;
     }
     
     public boolean IsFull() {
    	 
    	 if((rear+1)%data.length==front) {
    		 return true;
    	 }
    	 
    	 return false;
     }
     
     public void enqueue(int val) throws Exception {
    	 
    	  if(IsFull()==true) {
    		  
    		  throw new Exception("Queue is Full");
    	  } else if(IsEmpty()==true) {
    		 front=0;
    		 rear=0;
    		 data[rear]=val;
    	 }else {
    		 rear=(rear+1)%data.length;
    		 data[rear]=val;
    	 }
     }
     
     public int Dequeue() throws Exception{
    	 
    	 if(IsEmpty()==true) {
    		 
    		 throw new Exception("Queue is underflow");
    	 }else if(front==rear) {
    		 
    		 int result= data[front];
    		 front=-1;
    		 rear=-1;
    		 
    		 return result;
    	 }else {
    		 int result= data[front];
    		 front=(front+1)%data.length;
    		 return result;
    	 }
    	 
     }
    	 
    	 public int peek() throws Exception {
    		 
    		 if(IsEmpty()) {
    			 
    			 throw new Exception("Queue is Underflow");
    			 
    		 }else {
    			 return data[front];
    		 }
    	 }
     }

