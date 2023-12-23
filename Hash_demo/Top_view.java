package Hash_demo;

import java.util.HashMap;

import Tree.MyTree;
import Tree.TreeNode;

public class Top_view {
     
	                                                           //dis, NodeValue
	public static void Top_view(TreeNode root, int dis,HashMap<Integer, Integer> m) {
		
		  
		   if(root==null) {
			   
			   return;
		   }
		
		  if(m.containsKey(dis)==false) {
			  
			  System.out.println(root.data+ " ");
			  m.put(dis, root.data);
		  }
		  
		  
		  Top_view(root.left, dis-1, m);
		  Top_view(root.right, dis+1, m);
		  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// 12 5 -1 7 -1 -1 6 9 -1 -1 8 -1 -1
		MyTree t= new MyTree();
		
		HashMap<Integer, Integer> m= new HashMap<>();
		 Top_view(t.root, 0,m);
		 
		
	}

}
