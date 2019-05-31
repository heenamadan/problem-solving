package maypractice;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class NodeDonotHaveSiblings {
    Node root;

    void printSibling(Node node) {



        if (node == null) {
            return;
        }

         else if (node.left != null && node.right != null)
        {
            printSibling(node.left);
            printSibling(node.right);

        }

        else if (node.left != null && node.right ==null)
        {
            System.out.print( node.left.data + " ");
            printSibling(node.left);
        }


        else if (node.right != null && node.left ==null)
        {
            System.out.print(node.right.data + " ");
            printSibling(node.right);
        }



    }

    public static void main(String args[])
    {
        NodeDonotHaveSiblings tree = new NodeDonotHaveSiblings();

        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.left.left = new Node(5);
        tree.root.left.left.left = new Node(1);
        tree.root.left.left.left.right = new Node(50);
        //tree.root.right.left.right = new Node(6);
        tree.printSibling(tree.root);
    }

}
