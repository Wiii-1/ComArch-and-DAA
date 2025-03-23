import java.util.Random;
class Node {
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class Binary_search_tree{
    Node root;
    

    public Binary_search_tree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key){
        if (root == null){
            return new Node(key);
        }

        if(key < root.key){
            root.left = insertRec(root.left , key);
        }
        else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    public void inorder(){
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.print(root. key + " ");
            inorderRec(root.right);
        }
    }

}

public class BST {
    public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000}; 
        Random rand = new Random();

        for (int n : inputSizes) {
            performanceMonitor monitor = new performanceMonitor();
            monitor.start();

            Binary_search_tree bst = new Binary_search_tree();

            
            for (int i = 0; i < n; i++) {
                bst.insert(rand.nextInt(n * 10)); 
            }

            
            System.out.print("Sample output (" + n + " elements): ");
            bst.inorder(); 

            monitor.stop("BST");

        }
    }
}