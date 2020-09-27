package src.BSTProblems;

//import java.util.Queue;
//import java.util.concurrent.PriorityBlockingQueue;

import src.BST.Node;

public class LevelOrder {

    /*
     * private Queue<Node> queue = new PriorityBlockingQueue<Node>();
     * 
     * public void levelOrderUtil(final Node root) {
     * 
     * if (root == null) return;
     * 
     * root if (root.left != null) queue.add(root.left);
     * 
     * if (root.right != null) queue.add(root.right);
     * 
     * levelOrderUtil(root.left); levelOrderUtil(root.right); }
     * 
     * public void levelOrder(final Node root) {
     * 
     * levelOrderUtil(root); Node current; while (!queue.isEmpty()) { current =
     * queue.poll(); System.out.print(current.data); }
     * 
     * }
     * 
     */

    public void levelOrder(final Node root) {

        int level = 1;
        while (levelOrderUtil(root, level))
            level++;

    }

    public boolean levelOrderUtil(final Node root, int level) {

        if (root == null)
            return false;

        if (level == 1) {
            System.out.print(root.data + " ");
            return true;
        }

        boolean left = levelOrderUtil(root.left, level - 1);
        boolean right = levelOrderUtil(root.right, level - 1);

        return left || right;

    }

}
