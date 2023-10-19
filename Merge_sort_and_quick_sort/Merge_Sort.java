package Merge_sort_and_quick_sort;

public class Merge_Sort {
     public static void merge(int [] arr, int s, int mid, int e) {
    	 
    	 int i=s;
    	 int j=mid+1;
    	 
    	 int [] ans= new int[e-s+1];
    	 int index=0;
    	 
    	 while(i<=mid && j<= e) {
    		 
    		 if(arr[i]< arr[j]) {
    			 ans[index]=arr[i];
    			 index++;
    			 i++;
    		 }else {
    			 ans[index]=arr[j];
    			 j++;
    			 index++;
    		 }
    	 }
    	 
    	 while(i<=mid) {
    		 
    		 ans[index]=arr[i];
    		 i++;
    		 index++;
    	 }
    	 
    	 while(j<=e) {
    		 
    		 ans[index]=arr[j];
    		 j++;
    		 index++;
    	 }
    	 
    	 index=0;
    	 for(int k=s; k<=e;k++) {
    		 arr[k]=ans[index];
    		 index++;
    	 }
    	 
     }
	public static void mergeSort(int [] arr, int s, int e) {
		
		  if(s>=e) {
			  return ;
		  }
		 int mid= (s+e)/2;
		 
		 mergeSort(arr, s, mid);
		 mergeSort(arr, mid+1,e);
		 merge(arr,s, mid, e);
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {6,3,2,10,3,4,2};
       
        mergeSort(arr, 0, arr.length-1);
        
        for(int i=0; i<arr.length;i++) {
        	
        	System.out.print(arr[i]+" ");
        }
	}

}
