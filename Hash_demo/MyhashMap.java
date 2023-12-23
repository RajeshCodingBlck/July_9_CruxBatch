package Hash_demo;

import java.util.LinkedList;

public class MyhashMap {
     
	
	LinkedList<Entry> [] arr;
	
	int count=0;
	
	float load_factor=0.75f;
	
	MyhashMap(){
		
	  arr= new LinkedList[10];
	  
	  for(int i=0; i<10;i++) {
		  
		 arr[i]= new LinkedList();
		 
	  }
	}
	
	public  int hashfunction( String key) {
		 
		
	  int hash_val= Math.abs(key.hashCode());
	  
	  
	  int index= hash_val% arr.length;
	  
	  return index;
	 }
	
	public void put(String key, int val) {
		
		int index = hashfunction(key);
		
		if(containsKey(key)==true) {
			
			// update the value for 
			
			for(int i=0; i< arr[index].size();i++) {
				
				if(arr[index].get(i).key == key) {
					
					arr[index].get(i).value=val;
				}
			}
		}else {
			count++;
			Entry e= new Entry(key, val);
			
			arr[index].addFirst(e);
		
		}
		
		float curr_factor=  (float)count/ (float)arr.length;
		
		if(curr_factor> load_factor) {
			
			rehashing();
		}
	}
	
private void rehashing() {
		// TODO Auto-generated method stub
		LinkedList<Entry> [] old= arr;
		
		arr= new LinkedList[2*old.length];
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i]=new LinkedList();
		}
		
		for(int i=0; i<old.length;i++) {
			
			
			
			for(int j=0; j<old[i].size();j++) {
				
				put(old[i].get(j).key, old[i].get(j).value);
			}
		}
	}

public int get(String key) throws Exception {
		
		int index= hashfunction(key);
		
		 if(containsKey(key)==true) {
			 
			 int value=-1;
			for(int i=0; i< arr[index].size();i++ ) {
				
				if(arr[index].get(i).key==key) {
					
					value= arr[index].get(i).value;
					
				}
			}
			
			return value;
			
		 }else {
			 
			 // throw Exception.
			 
			 throw  new Exception("Key is Not Present");
		 }
	}
	
	public void remove(String key) throws Exception {
		
		int index= hashfunction(key);
		
		 if(containsKey(key)==true) {
			 
			for(int i=0; i< arr[index].size();i++ ) {
				
				if(arr[index].get(i).key==key) {
					
					arr[index].remove(i);
					break;
				}
			}
		 }else {
			 
			 // throw Exception.
			 
			 throw  new Exception("Key is Not Present");
		 }
	}
	
	 public boolean containsKey(String key) {
		 
		 int index= hashfunction(key);
		 
		 for(int i=0 ; i< arr[index].size();i++) {
			 
			 if(arr[index].get(i).key== key) {
				  return true;
			 }
		 }
		 
		 return false;
	 }
	
	
	
}
