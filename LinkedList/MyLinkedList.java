package LinkedList;

public class MyLinkedList {
    
	public Node head;
	
	public MyLinkedList(){
		head=null;
	}
	
	public void addAtbegin(int val) {
		
		Node new_node= new Node(val);
		
		new_node.next=head;
		
		head=new_node;
	}
	
	public void addAtEnd(int val) {
		
		Node new_node= new Node(val);
		
		Node temp=head;
		
		if(head==null) {
			
			head=new_node;
			return;
		}
		
		
		while(temp.next !=null) {
			
			temp= temp.next;
			
		}
		
		temp.next=new_node;
		 
		
		
	}
	
	public void removeAtBegin()  throws  Exception{
		
		if(head==null) {
			
			throw new Exception("List is Empty");
		}
		
	  Node temp= head;
	  
	  head= head.next;
	  
	  temp.next=null;
	  
	  
	}
	
   public void removeAtEnd() {
	   
	   if(head==null ) {
		   // throw exception
	   }
	   if(head.next==null) {
		   head=null;
		   return;
	   }
	  Node temp= head;
	  
	  while(temp.next.next !=null) {
		  
		  temp=temp.next;
	  }
	  
	  temp.next=null;
	  
   }
   
   public void addAt(int index, int val) {
	   
	   Node new_node =new Node(val);
	   
	   int jump=index-1;
	   
	   Node temp=head;
	   
	   while(jump>0) {
		   
		   temp=temp.next;
		   jump--;
	   }
	   Node temp2= temp.next;// old relation
	   temp.next=new_node;// new_ relation
	   new_node.next=temp2;
	   
   }
	
	public void display() {
		
		Node temp=head;
		
		while(temp !=null) {
			
			System.out.print(temp.data+" -> ");
			 temp=temp.next;
		}
		
		System.out.print("N");
		
	}
	
	
	
}
