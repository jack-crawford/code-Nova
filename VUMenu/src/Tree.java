
public class Tree {
	private TreeNode root;
	public Tree() {
		root = null;
	}
	public void insertNode(int insertValue) {
		if(root == null)
			root = new TreeNode(insertValue);
		else 
			root.insert(insertValue);
	}
	public void preOrder() {
		preOrderHelper(root);
	}
	public void preOrderHelper(TreeNode root) {
		if(root == null)
			return;
		System.out.print(root.data + ", ");
		preOrderHelper(root.left);
		preOrderHelper(root.right);
	}
	public void postOrderHelper(TreeNode root) {
		if(root == null)
			return;
		postOrderHelper(root.left);
		postOrderHelper(root.right);
		System.out.print(root.data + ", ");
		
	}
	public void postOrder() {
		postOrderHelper(root);
	}
	public void inOrderHelper(TreeNode root) {
		if(root == null)
			return;
		inOrderHelper(root.left);
		System.out.print(root.data + ", ");
		inOrderHelper(root.right);
	}
	public void inOrder() {
		inOrderHelper(root);
	}
}
