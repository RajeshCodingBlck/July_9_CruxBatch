package Recursion_Lecture_3;

public class Opening_closing_prenthesis {
   
	public static void Print(String path,int open, int closing) {
		
		  if(open==0 && closing==0) { // +Ve Base Case
			  System.out.println(path);
			  return;
		  }
		  
		  if(open>closing ) { // -Ve Base case for Inavlid
			  
			  return;
		  }
		  
		  if(open<0 || closing<0) { // -ve Base Case
			  return;
		  }
		  
		  
		  Print(path+"(",open-1, closing );
		  Print(path+")",open, closing-1 );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Print("",4,4);
	}

}
