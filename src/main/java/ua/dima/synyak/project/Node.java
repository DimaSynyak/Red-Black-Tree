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

    public static int diameterOfTree(Node root, boolean flag){
        int count = 0;

        if (root.left == null && root.right == null){
            count++;
            return count;
        }
        else if (root.left != null && root.right != null && !flag){
            int count_r = diameterOfTree(root.right, false);
            int count_l = diameterOfTree(root.left, false);
                count++;
            if (count_r >= count_l){
                count += count_r;
            }
            else {
                count += count_l;
            }
        }
        else if (root.left != null && root.right != null && flag){
            int count_r = diameterOfTree(root.right, false);
            int count_l = diameterOfTree(root.left, false);
            count++;
            count += count_r;
            count += count_l;
        }
        else{
            count++;
            if (root.left != null) {
                count += diameterOfTree(root.left,false);
            }
            else{
                count += diameterOfTree(root.right, false);
            }
        }
        return count;
    }
}
