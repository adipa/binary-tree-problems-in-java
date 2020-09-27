package src.BST;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root, parent = null;

        while (current != null) {
            parent = current;

            if (data <= current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (data <= parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return;
    }
}