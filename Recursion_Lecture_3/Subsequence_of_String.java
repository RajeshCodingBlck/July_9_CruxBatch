package Recursion_Lecture_3;

public class Subsequence_of_String {
   
	public static void Print_SubSeq(String ques, String ans) { // (abc, "")
		 
		 if(ques.length()==0) {
			 System.out.println(ans);
			 return;
		 }
		char ch= ques.charAt(0);
		Print_SubSeq(ques.substring(1),ans+"");
		Print_SubSeq(ques.substring(1), ans+ch);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ques= "ab";
        String ans="";
        
        Print_SubSeq(ques, ans);
	}

}
