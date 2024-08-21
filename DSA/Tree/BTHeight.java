class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BTHeight {
    Node root;

    public BTHeight() {
        root = null;
    }

    int findHeight(Node node) {
        if (node == null)
            return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    int getHeight() {
        return findHeight(root);
    }

    public static void main(String[] args) {
        BTHeight tree = new BTHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Height of the binary tree: " + tree.getHeight());
    }
}
