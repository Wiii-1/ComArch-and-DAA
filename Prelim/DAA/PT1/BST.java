


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class Binary_search_tree {
    Node root;

    public Binary_search_tree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}

public class BST {
   public static void main(String[] args) {
        int[] inputSizes = {100, 1000, 10000, 100000, 1000000}; 
        Random rand = new Random();
        List<String> results = new ArrayList<>(); 

        for (int n : inputSizes) { 
            performanceMonitor monitor = new performanceMonitor();
            monitor.start();

            Binary_search_tree bst = new Binary_search_tree();

            for (int i = 0; i < n; i++) { 
                bst.insert(rand.nextInt(n * 10)); 
            }

            System.out.println("Sample output (" + " elements): ");
            bst.inorder(); 

            
            String result = monitor.stopAndReturn("BST");
            results.add(result); 
        }

        
        System.out.println("\n========= PERFORMANCE RESULTS =========");
        for (String res : results) {
            System.out.println(res);
        }
        System.out.println("========================================");
    }
    
}
