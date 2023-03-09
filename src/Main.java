class Main {

    Node root;

    public static void main(String[] args) {

        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.right.right.right = new Node(7);
        tree.root.left.left.left.left = new Node(8);
        tree.root.right.right.right.right = new Node(9);
        tree.root.left.left.left.left.left = new Node(10);
        tree.root.right.right.right.right.right = new Node(11);
        tree.root.left.left.left.left.left.left = new Node(12);


        System.out.print("\nInorder traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPreorder traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.traversePostOrder(tree.root);
    }

    Main() {
        root = null;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }
}