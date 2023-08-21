package Lec12;

public class reverseTheArray {
   
  public static void reverse(int [] arr,int s, int e) {
	  
	  int i=s;
	  int j=e;
	  
	  
	  while(i<j) {
		  
		  int temp=arr[i];
		  arr[i]=arr[j];
		  arr[j]=temp;
		  i++;
		  j--;
	  }
	  
	  
	  
	   
	   
  }
  
   public static int [] reverse1(int [] arr) {
	   
	   int [] narr=new int [arr.length];
	   
	   int index=0;
	   
	   for(int i=arr.length-1;i>=0;i--) {
		   
		   narr[index]=arr[i];
		   index++;
	   }
	   
	   return narr;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  int [] arr= {1,2,3,4,5,6};
	  
	   reverse(arr,2,5);
	   
//	   int [] narr=reverse1(arr);
//	   
	   for(int i=0; i<arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   
	}

}
