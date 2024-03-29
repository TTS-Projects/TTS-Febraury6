package binary_search_tree;

public class BinaryTree {
	Node root; 
	
	public Node insertNode(Node current, int key) {
		
		//...full code on next slide
		
		if(current == null) {
			return new Node(key);
		}else if(key < current.getKey()) {
			current.setLeftNode(insertNode(current.getLeftNode(), key));
		}else if(key > current.getKey()) {
			current.setRightNode(insertNode(current.getRightNode(), key));
		}else {
			return current; 
		}
		
		return current;
	}
    
    public void add(int key){
    	root = insertNode(root, key);
    }
    
  //in BinaryTree class
    @Override
    public String toString() {
    	return "BinaryTree: \nroot=" + root;
    }

    
    	
    
    
}