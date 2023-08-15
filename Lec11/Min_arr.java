package Lec11;

public class Min_arr {

	public static int findMin(int [] arr) {
		
		int min_ans=arr[0];
		
		for(int i=1; i<arr.length;i++) {
			
			if(min_ans> arr[i]) {
				min_ans=arr[i];
			}
		}
		
		return min_ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {10,7,-18,20,100,5};
     
       int min_ans= findMin(arr);
       
       System.out.println(min_ans);
	}

}
