package Merge_sort_and_quick_sort;

public class Quick_sort_recursive {
    public static int pivot_correct(int [] arr, int s, int e) {
    	
    	int len=  e-s+1;
    	int pivot= arr[e];
    	
    	int [] ans= new int[len];
    	
    	
    	
    	int i=0;
    	
    	int j= ans.length-1;
    	
    	 for(int k=s; k<e;k++) {
    		 
    		  if(arr[k]<pivot) {
    			  ans[i]=arr[k];
    			  i++;
    		  }else {
    			  ans[j]=arr[k];
    			  j--;
    		  }
    	 }
    	 
    	 ans[i]=pivot;
    	 
    	 int index=0;
    	 
    	  for(int k=s; k<=e;k++) {
    		  
    		  arr[k]=ans[index];
    		  index++;
    	  }
    	 
    	 return i+s;
    	 
    	
    }
    public static void QuickSort(int [] arr, int s, int e) {
    	
    	 if(s>=e) {
    		 return;
    	 }
    	int p_index= pivot_correct(arr, s,e);
    	
    	QuickSort(arr, s, p_index-1);
    	QuickSort(arr, p_index+1, e);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  int [] arr= {4,3,1,2,10,7,8,5};
	  
	   QuickSort(arr,0,arr.length-1);
	   
	    for(int i=0; i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	   
	}

}
