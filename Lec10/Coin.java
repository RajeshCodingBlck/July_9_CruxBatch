package Lec10;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,1,1,1,1,1,0,1};
		
		int sum1=arr[0]+arr[1]+arr[2];
		int sum2= arr[3]+arr[4]+arr[5];
		
		if(sum1== sum2) {
			
			if(arr[6]<arr[7]) {
				System.out.println(6);
			}else {
				System.out.println(7);
			}
			
		}else {
			
			 if(sum1<sum2) {
				 
				 if(arr[0]==arr[1]) {
					 System.out.println(2);
				 }else {
					 
					 if(arr[0]<arr[1]) {
						 System.out.println(0);
					 }else {
						 System.out.println(1);
					 }
				 }
				 
			 }else {
				 
				 if(arr[3]==arr[4]) {
					 System.out.println(5);
				 }else {
					 
					 if(arr[3]<arr[4]) {
						 System.out.println(3);
					 }else {
						 System.out.println(4);
					 }
				 }
				 
			 }
		}

	}

}
