package src.BSTProblems;

import src.BST.Node;

public class LeftView {

    public void leftView(Node root) {

        int level = 1;
        int maxLevel = 0;
        leftViewUtil(root, level, maxLevel);

    }

    public void leftViewUtil(Node root, int level, int maxLevel) {

        if (root == null)
            return;

        if (maxLevel < level) {
            System.out.print(root.data);
            maxLevel = level;
        }

        leftViewUtil(root.left, level + 1, maxLevel);
        leftViewUtil(root.right, level + 1, maxLevel);

    }

}