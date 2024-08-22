class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class IsBinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isFullBinaryTree(Node node) {
        if (node == null)
            return true;

        if (node.left == null && node.right == null)
            return true;

        if (node.left != null && node.right != null)
            return isFullBinaryTree(node.left) && isFullBinaryTree(node.right);

        return false;
    }

    boolean isFullBinaryTree() {
        return isFullBinaryTree(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        if (tree.isFullBinaryTree()) {
            System.out.println("The binary tree is a full binary tree.");
        } else {
            System.out.println("The binary tree is not a full binary tree.");
        }
    }
}
