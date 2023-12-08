package OOP1;

public class Mobile {
     
	   String color;
	  
	   int version;
	   
	   boolean warranty;
	   
	   String material;
	   
	   int price;
	   
	   Mobile(String color, int version){
		   
		      this.color=color;
		     this.version=version;
	   }
	   
	   Mobile(String color){
		   
	   }
	   
	  
	   public  void Description() {
		   
		    color="Red";
		   
		    System.out.println("Color is "+ color);
		    System.out.println("version is "+ version);
		    System.out.println("price is "+ price);
	   }
	   
	   
	   
}
