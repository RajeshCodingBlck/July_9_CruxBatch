package Lec10;

public class IsPrime_function {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n=10;
		 
		 System.out.println(isPrime(n));
		 
	}
	
public static boolean isPrime(int n) {
		
		int count=0;
		for(int i=2; i<=n-1;i++) {
			
			if(n%i==0) {
				count++;
				break;
			}
		}
		
		if(count>=1) {
			return false;
		}else {
			return true;
		}
	}

}
