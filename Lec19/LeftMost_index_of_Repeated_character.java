package Lec19;

public class LeftMost_index_of_Repeated_character {
   
	public static int GetLeftMostIndex(String str) {
		
		int [] fre= new int [256];
		
		for(int i=0; i<str.length();i++) {
			
			fre[str.charAt(i)]+=1;
		}
		
		for(int i=0; i<str.length();i++) {
			
			if(fre[str.charAt(i)]>=2) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "gfababh";
       
       System.out.println(GetLeftMostIndex(str));
       
       
	}

}
