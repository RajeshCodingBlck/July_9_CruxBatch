package MYqueue;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Myqueue q= new Myqueue();
      
      q.enqueue(10);
      q.enqueue(20);
      q.enqueue(30);
      q.enqueue(40);
      q.enqueue(50);
      
      
      System.out.println(q.peek());
      System.out.println(q.Dequeue());
      System.out.println(q.peek());
      System.out.println(q.Dequeue());
      q.enqueue(60);
      
      
	}

}
