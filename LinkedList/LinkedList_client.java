package LinkedList;

public class LinkedList_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		
		
		
//		list.addAtbegin(20);
//		list.addAtbegin(30);
//		list.addAtbegin(50);
		
		list.addAtEnd(30);
		list.addAtEnd(40);
		list.addAtEnd(50);
		
//		list.display();
		list.addAtEnd(60);
		System.out.println();
		list.display();
		list.removeAtBegin();
		System.out.println();
		list.display();
		
		list.addAt(1, 110);
		System.out.println();
		list.display();
		
	}

}
