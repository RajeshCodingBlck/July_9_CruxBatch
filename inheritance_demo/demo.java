package inheritance_demo;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A obj= new B();
          
            System.out.println( obj.d);
            System.out.println(obj.d1);
          System.out.println(((B)obj).d2);
          
            obj.fun();
            obj.fun1();
           ( (B)obj).fun2();
          
	}

}
