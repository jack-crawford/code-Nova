public class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	public TreeNode(int nodeData) {
		data = nodeData;
		left = null;
		right = null;
	}
	
	public void insert(int insertVal) {
		if(insertVal < data) {
			if(left == null) 
				left = new TreeNode(insertVal);
			else 
				left.insert(insertVal);
		
		} else if(insertVal > data) {
			if(right == null) 
				right = new TreeNode(insertVal);
			else 
				right.insert(insertVal);
		}
	}
	public String toString() {
		return data + ", ";
	}
	public boolean leftIsEmpty() {
		return left == null;
	}
	public boolean rightIsEmpty() {
		return right == null;
	}
	public boolean nodeHasBranches() {
		return right == null || left == null;
	}
}
