package AmazonBhask;


class NodeBTDLL
{
    int data;
    NodeBTDLL left, right;

    public NodeBTDLL(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class BinaryTreetoDLL
{
    NodeBTDLL root;

    // head --> Pointer to head node of created doubly linked list
    NodeBTDLL head;

    // Initialize previously visited node as NULL. This is
    // static so that the same value is accessible in all recursive
    // calls
    static NodeBTDLL prev = null;

    // A simple recursive function to convert a given Binary tree 
    // to Doubly Linked List
    // root --> Root of Binary Tree
    void BinaryTree2DoubleLinkedList(NodeBTDLL root)
    {
        // Base case
        if (root == null)
            return;
        System.out.println("root-->"+root.data);
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);

        // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }


        prev = root;
        System.out.println("prev-->"+prev.data);

        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }

    /* Function to print nodes in a given doubly linked list */
    void printList(NodeBTDLL node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        // Let us create the tree as shown in above diagram
        BinaryTreetoDLL tree = new BinaryTreetoDLL();
        tree.root = new NodeBTDLL(10);
        tree.root.left = new NodeBTDLL(12);
        tree.root.right = new NodeBTDLL(15);
        tree.root.left.left = new NodeBTDLL(25);
        tree.root.left.right = new NodeBTDLL(30);
        tree.root.right.left = new NodeBTDLL(36);

        // convert to DLL
        tree.BinaryTree2DoubleLinkedList(tree.root);

        // Print the converted List
        tree.printList(tree.head);

    }
}
