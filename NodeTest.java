package hackveda.bhavesh.firstProject;

public class NodeTest {
	
	public static void main(String[] args) {
		
		Node node = new Node(10);
		node.left= new Node(4);
		node.right= new Node(8);
	}

	static class Node {
		
		int value; // The value or data to be stored in the Node
		
		Node left;

		Node right; // Pointers to the left and the right node
		
		Node(int value){
			this.value = value;
			
			left = null;
			right = null;
			
		}
		
	}
	
}