package Lec5;

public class Pre_increment_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=7;
        
        ++a;
        
        int b= a++ + 9 -a - --a;
        
        System.out.println(a);
        System.out.println(b);
	}

}
