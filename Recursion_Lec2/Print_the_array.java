package Recursion_Lec2;

public class Print_the_array {
	
    public static void Print(int [] arr, int i) {
    	
    	if(i==arr.length) { 
    		return;
    	}
    	
    	System.out.println(arr[i]);
    	// Sub -Problem 
    	 Print(arr, i+1);
    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int [] arr= {1,2,3,4,5};
		
		Print(arr,0);
	}

}
