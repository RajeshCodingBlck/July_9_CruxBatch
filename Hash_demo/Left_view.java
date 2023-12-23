package Hash_demo;

import java.util.*;
import Tree.*;
public class Left_view {
    
	// 12 5 -1 7 -1 -1 6 9 10 -1 -1  -1 8 -1 -1
	
	public static void Left_view(TreeNode root, int level,
			HashMap<Integer, TreeNode> m) {
		 
		   if(root==null) {
			   return ;
		   }
		 
		  if(m.containsKey(level)==false) {
			  m.put(level, root);
		  }
		  
		  Left_view(root.left, level+1,m);
		  Left_view(root.right, level+1, m);
		  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 MyTree t= new MyTree();
		 
		 
		 HashMap<Integer, TreeNode> m= new HashMap<>();
		 
		 Left_view(t.root, 0, m);
		 
		 
		 for(Integer key : m.keySet()) {
			 
			  System.out.print(m.get(key).data+" ");
		 }
		 
		 
		 
		 
		 
	}

}
