package Lec11;

public class Swap_demo_3 {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr1= {1,2,3,4,5};
       int [] arr2= {10,11,12,13,14};
       System.out.println("Before the Swap "+ arr1[0]+" "+arr1[1]);
       Swap(arr1, arr2);
       System.out.println("After the Swap "+ arr2[0]+" "+arr2[1]);
	}

	public static void Swap(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int [] temp=arr1;
		arr1=arr2;
		arr2=temp;
		
		
		
	}
	

}
