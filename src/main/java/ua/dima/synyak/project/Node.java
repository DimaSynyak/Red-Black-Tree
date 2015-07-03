package ua.dima.synyak.project;

/**
 * Created by root on 7/3/15.
 */
public class Node {
    private Node left, right;
    private int data;

    public Node(int data) {
        left = right = null;
        this.data = data;

    }

    public int getData() {
        return data;
    }

    public static Node insert(Node node, int data){
        if (node == null){
            node = new Node(data);
        }
        else {
            if (data < node.data){
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }
}
