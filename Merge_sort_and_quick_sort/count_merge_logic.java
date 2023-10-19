package Merge_sort_and_quick_sort;

public class count_merge_logic {
    
	public static int [] count(int [] arr1, int [] arr2) {
		
		
		int n= arr1.length;
		
		int [] ans= new int[n];
		
		int i=0;
		int j=0;
		
		int count=0;
		int index=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			 if(arr1[i]> arr2[j]) {
				 count++;
				 j++;
			 }else {
				 ans[index]= count;
				 index++;
				 i++;
			 }
		}
		
		while(i<arr1.length) {
			
			ans[index]=count;
			index++;
			i++;
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr1= {2,3,5,6,70,80};
        
        int [] arr2= {1,1,1,1,3,5,20};
        
        int [] ans= count(arr1, arr2);
        
         for(int i=0; i<ans.length;i++) {
        	 System.out.print(ans[i]+" ");
         }
	}

}
