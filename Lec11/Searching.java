package Lec11;

public class Searching {

	public static int Search(int [] arr, int item) {
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==item) {
				return i;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {-1,2,3,5,10};
       
       int item=2;
       
       int ans= Search(arr, item);
	}

}
