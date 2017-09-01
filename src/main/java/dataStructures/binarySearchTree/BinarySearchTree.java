package dataStructures.binarySearchTree;

/**
 * Created by 461967 on 6/23/17.
 */
public class BinarySearchTree {
    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean find(int data) {
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (current.data > data) {
                current = current.left;
            } else if (current.data < data) {
                current = current.right;
            }
        }
        return false;
    }

    public boolean delete(int data) {
        Node parent = root;
        Node current = root;
        boolean isLeft = false;
        while (current.data != data) {
            parent = current;
            if (current.data > data) {
                isLeft = true;
                current = current.left;
            } else {
                isLeft = false;
                current = current.right;
            }
            if (current == null)
                return false;
        }

        if (current.left == null && current.right == null) {
            if (current == root)
                root = null;
            if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root)
                root = current.left;
            else if (isLeft) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root)
                root = current.right;
            else if (isLeft) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeft) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node getSuccessor(Node deleleNode) {
        Node successsor = null;
        Node successsorParent = null;
        Node current = deleleNode.right;

        while (current != null) {
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }

        if (successsor != deleleNode.right) {
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }
}
