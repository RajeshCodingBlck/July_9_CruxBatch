package Merge_sort_and_quick_sort;

public class question1 {

	public static int [] merge(int [] arr1, int []arr2) {
		
		int i=0;
		
		int j=0;
		
		int length= arr1.length+ arr2.length;
		
		int [] ans= new int[length];
		
		int index=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			 if(arr1[i]<arr2[j]) {
				 ans[index]=arr1[i];
				 index++;
				 i++;
			 }else {
				 ans[index]= arr2[j];
				 index++;
				 j++;
			 }
		}
		
		
		while(i<arr1.length) {
			
			ans[index]=arr1[i];
			i++;
			index++;
		}
		
		while(j<arr2.length) {
			
			ans[index]= arr2[j];
			index++;
			j++;
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		
		int [] arr1= {3,4,6,10,12};
		
		int [] arr2= {1,2,6,100};
		
		int [] ans= merge(arr1, arr2);
		
		for(int i=0; i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
