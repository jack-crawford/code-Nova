
public class TreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree = new Tree();
		int value = 1;
		while(value <= 15) {
			tree.insertNode(value * (value+(value%2)) + 1);
			System.out.println(value * (value+(value%2)) + 1);
			value ++;
		}
		System.out.println("Pre");
		tree.preOrder();
		System.out.println();
		System.out.println("post");
		tree.postOrder();
		System.out.println();
		System.out.println("in");
		tree.inOrder();


		
	}

}
