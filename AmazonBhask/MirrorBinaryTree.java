package AmazonBhask;



class NodeBT
{
    int data;
    NodeBT left, right;

    public NodeBT(int item)
    {
        data = item;
        left = right = null;
    }
}

class MirrorBinaryTree
{
    NodeBT root;

    void mirror()
    {

        root = mirror(root);
    }

    NodeBT mirror(NodeBT node)
    {
        if (node == null)
            return node;

        /* do the subtrees */
        NodeBT left = mirror(node.left);
        NodeBT right = mirror(node.right);

        /* swap the left and right pointers */
        node.left = right;
        node.right = left;

        return node;
    }

    void inOrder()
    {
        inOrder(root);
    }

    /* Helper function to test mirror(). Given a binary
       search tree, print out its data elements in
       increasing sorted order.*/
    void inOrder(NodeBT node)
    {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        MirrorBinaryTree tree = new MirrorBinaryTree();
        tree.root = new NodeBT(1);
        tree.root.left = new NodeBT(2);
        tree.root.right = new NodeBT(3);
        tree.root.left.left = new NodeBT(4);
        tree.root.left.right = new NodeBT(5);

        /* print inorder traversal of the input tree */
        System.out.println("Inorder traversal of input tree is :");
        tree.inOrder();
        System.out.println("");

        /* convert tree to its mirror */
        tree.mirror();

        /* print inorder traversal of the minor tree */
        System.out.println("Inorder traversal of binary tree is : ");
        tree.inOrder();

    }
}
