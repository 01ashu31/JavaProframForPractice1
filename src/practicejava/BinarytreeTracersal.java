package practicejava;

public class BinarytreeTracersal {
	 public static String findPostOrder(String inorder, String preorder) {
	        if (inorder.length() == 0 || preorder.length() == 0) {
	            return "";
	        }
	        
	        // The first character in the preorder traversal is the root node
	        char rootValue = preorder.charAt(0);
	        int rootIndex = inorder.indexOf(rootValue);
	        
	        // Split the inorder traversal into left and right subtrees
	        String leftInorder = inorder.substring(0, rootIndex);
	        String rightInorder = inorder.substring(rootIndex + 1);
	        
	        // Split the preorder traversal into left and right subtrees
	        String leftPreorder = preorder.substring(1, rootIndex + 1);
	        String rightPreorder = preorder.substring(rootIndex + 1);
	        
	        // Recursively traverse the left and right subtrees
	        String leftPostorder = findPostOrder(leftInorder, leftPreorder);
	        String rightPostorder = findPostOrder(rightInorder, rightPreorder);
	        
	        // Concatenate the left and right postorder traversals with the root value
	        return leftPostorder + rightPostorder + rootValue;
	    }
	    
	    public static void main(String[] args) {
	        String inorder = "42513";
	        String preorder = "12453";
	        
	        String postorder = findPostOrder(inorder, preorder);
	        System.out.println("Postorder traversal: " + postorder);
	    }

}
