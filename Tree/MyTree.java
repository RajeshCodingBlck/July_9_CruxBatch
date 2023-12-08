package Tree;

import java.util.Scanner;

public class MyTree {
    
	 TreeNode root;
	 
	 Scanner s=new Scanner(System.in);
	 
	 MyTree(){
		 
		 root=createTree();
	 }
	 
	 public TreeNode createTree() {
		 
		 System.out.println("Enter the data");
		 
		 int data= s.nextInt();
		 
		 if(data==-1) {
			 return null;
		 }
		 
		 TreeNode curr_root=new TreeNode(data);
		 
		 System.out.println("Enter the left chid of "+ data);
		 
		 curr_root.left= createTree();
		 
		 System.out.println("Enter the right chid of "+ data);
		 
		 curr_root.right= createTree();
		 
		 return curr_root;
	 }
}
