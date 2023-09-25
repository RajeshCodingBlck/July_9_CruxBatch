package Lec19;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Integer a= 123;
//        System.out.println(a);
//        
//        int b= a ;// unboxing            //  Internal -> a.intValue();
//        System.out.println(b);
//        
//        Integer c= b; // autoboxing  //  Integer.valueof(b);
//        
//        System.out.println(c);
        
        
        Integer a= 19;
        Integer b=19;
        
        if(a==b) {
        	System.out.println("same");
        }else {
        	System.out.println(" not same");
        }
        
        Integer c= 900;
        Integer d= 900;
        
        if(c==d) {
        	
        	System.out.println("Same");
        }else {
        	System.out.println("Not same");
        }
        
        
        
        
	}

}
