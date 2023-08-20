package SortAlgorithms;

import java.util.Arrays;

public class TreeSort {

    static class Node
    {
        double key;
        Node left, right;

        public Node(double item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    TreeSort(){
        root = null;
    }

    void insert(double key)
    {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, double key)
    {
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    void inorderRec(Node root)
    {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
    void treeins(double[] array)
    {
        for (double v : array) {
            insert(v);
        }
    }

    public static void main(String[] args) {
        double[] array = SortTools.randomDoubleArray();

        System.out.println("Given Array");
        System.out.println(Arrays.toString(array));

        TreeSort ob = new TreeSort();
        ob.treeins(array);

        System.out.println("\nSorted array");
        ob.inorderRec(ob.root);
    }
}
