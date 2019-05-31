package AmazonBhask;

class NodeCh
{
    int data;
    NodeCh left, right;

    public NodeCh(int d)
    {
        data = d;
        left = right = null;
    }
}

public class GetChildrenOfNode {

    NodeCh root;
    public static void main(String[] args)
    {
        GetChildrenOfNode tree = new GetChildrenOfNode();
        tree.root = new NodeCh(10);
        tree.root.left = new NodeCh(8);
        tree.root.right = new NodeCh(2);
        tree.root.left.left = new NodeCh(3);
        tree.root.left.right = new NodeCh(5);
        tree.root.right.right = new NodeCh(2);
        tree.findNodes(new NodeCh(5));
    }

    int[] findNodes(NodeCh node){
        if(root==null){
            return null;

        }
        else {
            if (node.data == root.data) {

            }
        }
        return null;

    }
}
