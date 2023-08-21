package Lec12;

public class LinearSearch {
   
	public static int LinearSearch(int [] arr, int val) {
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==val) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] arr= {3,6,12,9,21,8};
	
	  int ans= LinearSearch(arr,12);
	  
	  System.out.println(ans);
 
	}

}
