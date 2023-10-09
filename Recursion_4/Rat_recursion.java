package Recursion_4;

public class Rat_recursion {
    
	public static void Rat_in_Maze(int  curr_row, int curr_col, 
			                       int des_row, int des_col, String ans) {
		
		 if(curr_row== des_row && curr_col == des_col) {
			 System.out.println(ans);
			 return;
		 }
		 
		 if(curr_row> des_row  || curr_col>des_col) {
			 
			 return ;
		 }
		
		Rat_in_Maze(curr_row+1, curr_col, des_row, des_col, ans+"D" );
		Rat_in_Maze(curr_row, curr_col+1, des_row, des_col, ans+"R");
		
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rat_in_Maze(0,0, 2,2, "");

	}

}
