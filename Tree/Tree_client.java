package Tree;

public class Tree_client {
    
	public static void preorder(TreeNode root) {
		
		if(root==null) {
			
			return ;
		}
		
		System.out.print(root.data+" ");
		
		preorder(root.left);
		preorder(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyTree t= new MyTree();
		
		preorder(t.root);
		
		
	}

}
