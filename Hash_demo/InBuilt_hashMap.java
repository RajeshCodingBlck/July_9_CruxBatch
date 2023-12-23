package Hash_demo;

import java.util.HashMap;

public class InBuilt_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
     HashMap<String, Integer> myhash= new HashMap<>();
     
       myhash.put("Mohan", 45);
       
       myhash.put("Sohan", 45);
       myhash.put("Krish", 60);
       myhash.put("Rohan", 95);
       myhash.put("Krish", 30);
      
       myhash.remove("Krish");
       
       if(myhash.containsKey("Sohan")) {
    	   
    	   System.out.println(myhash.get("Sohan"));
    	   
       }
       
       for( String key : myhash.keySet()) {
    	   
    	   System.out.println(key+ " "+ myhash.get(key));
    	   
       }
       
	}

}
