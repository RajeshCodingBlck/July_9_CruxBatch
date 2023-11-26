package LinkedList;

public class LinkedList_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    Node n1= new Node(12);
	    Node n2= new Node(20);
	    Node n3= new Node(40);
	    n1.next=n2;
	    n2.next=n3;
	    Node head=n1;
	    System.out.println(n1.data);
	    System.out.println(n1.next);
	    
	}

}
