package Lec13;

public class Min_index {
    
	public static int min_fun(int [] arr, int s, int e) {
		
		int min_index=s;
		
		for(int i=s; i<=e;i++) {
			
			if(arr[i]<arr[min_index]) {
				min_index=i;
			}
		}
		
		return min_index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {7,2,1,4,5};
		
		for(int i=0; i<arr.length;i++) {
			
			// selection 
			int min_index= min_fun(arr,i, arr.length-1);
			
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
//		System.out.println(min_fun(arr,0,1));
		
	}

}
