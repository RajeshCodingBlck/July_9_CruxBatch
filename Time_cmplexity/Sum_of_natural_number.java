package Time_cmplexity;

public class Sum_of_natural_number {
    
	public static int method1(int n) {
		
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	public static int method2(int n) {
		
		int val= (n)*(n+1);
		
		int ans= val/2;
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        
        long start= System.nanoTime();
        
         System.out.println(method1(n));
         
         long end= System.nanoTime();
         
         System.out.println(end-start);
         
         
         for(int i=1; i<=n;i++) {
        	 
        	 for(int j=1; j<=n;j++) {
        		 
        		 System.out.println("hello");
        		 
        	 }
         }
         
         
         
 
	}

}
