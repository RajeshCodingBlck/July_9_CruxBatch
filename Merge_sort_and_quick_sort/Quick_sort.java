package Merge_sort_and_quick_sort;

public class Quick_sort {
   
	public static int Pivot_set_to_its_correct_position(
			 int [] arr) {
		
		 int n= arr.length;
		 int pivot= arr[n-1];
		 
		 int [] ans= new int[n];
		 
		 int i=0;
		 int j= ans.length-1;
		 
		  for(int k=0; k<n-1;k++) {
			  
			  if(arr[k]<pivot) {
				  ans[i]=arr[k];
				  i++;
			  }else {
				  ans[j]=arr[k];
				  j--;
			  }
		  }
		  ans[i]=pivot;
		  
		  for(int k=0; k<n;k++) {
			  
			  System.out.print(ans[k]+" ");
		  }
		  System.out.println();
		  
		  return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int [] arr= {4,3,9,111,13,5};
		
		System.out.println(
				Pivot_set_to_its_correct_position(arr));
		
	}

}
