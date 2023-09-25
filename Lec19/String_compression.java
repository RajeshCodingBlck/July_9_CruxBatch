package Lec19;

public class String_compression {
    
	public static String Compressed(String str) {
		
		String ans="";
		
		int fre=1;
		
		for(int i=1; i<str.length();i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				fre++;
			}else {
				ans+= str.charAt(i-1)+ Integer.toString(fre);
				
				fre=1;
			}
		}
		
		ans+=  str.charAt(str.length()-1)+ Integer.toString(fre);
		
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "aaabbaaaab";
       
       System.out.println(Compressed(str));
       
	}

}
