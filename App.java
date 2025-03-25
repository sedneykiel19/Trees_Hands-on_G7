class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

   
    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    
    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        
       
        int[] values = {10, 5, 15, 3, 8, 20};
        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        
        System.out.println("In-Order Traversal:");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("Pre-Order Traversal:");
        tree.preOrder(tree.root);
        System.out.println();

        System.out.println("Post-Order Traversal:");
        tree.postOrder(tree.root);
        System.out.println();
    }
}



