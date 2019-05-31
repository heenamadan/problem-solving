package feb19;
class BNode
{
    int data;
    BNode left, right;

    public BNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}
public class BinaryTreeToLL {
    BNode root;
    BNode head;
    static BNode prev = null;

    public static void main(String[] args) {
        // Let us create the tree as shown in above diagram
        BinaryTreeToLL tree = new BinaryTreeToLL();
        tree.root = new BNode(10);
        tree.root.left = new BNode(12);
        tree.root.right = new BNode(15);
        tree.root.left.left = new BNode(25);
        tree.root.left.right = new BNode(30);
        tree.root.right.left = new BNode(36);

        // convert to DLL
        tree.BinaryTree2DoubleLinkedList(tree.root);

        // Print the converted List
        tree.printList(tree.head);

    }

    void BinaryTree2DoubleLinkedList(BNode root) {
        // Base case
        if (root == null)
            return;

        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);

        // Now convert this node
        if (prev == null)
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }

    void printList(BNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
}

