package com.mycompany.pt1_continuation;

import java.util.Random;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    private Node root;

    public BST() {
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

    public void runBST(int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            insert(rand.nextInt(size * 10));
        }
    }
}
