package AmazonBhask;

class NodeC
{
    int data;
    NodeC left, right;

    public NodeC(int d)
    {
        data = d;
        left = right = null;
    }
}


public class ChildrenSumProperty {

    NodeC root;
    public static void main(String[] args)
    {
        ChildrenSumProperty tree = new ChildrenSumProperty();
        tree.root = new NodeC(10);
        tree.root.left = new NodeC(8);
        tree.root.right = new NodeC(2);
        tree.root.left.left = new NodeC(3);
        tree.root.left.right = new NodeC(5);
        tree.root.right.right = new NodeC(2);
        if (tree.isSumProperty(tree.root))
            System.out.println("Yo yo");
        else
            System.out.println("no no");
    }

    static Boolean isSumProperty(NodeC node){
        int left_data = 0, right_data = 0;
        if(node==null || (node.left==null && node.right==null)) {
            return true;
        }
        else{
            if(node.left!=null){
                left_data = node.left.data;
            }
            if(node.right!=null){
                right_data=node.right.data;
            }
            if(node.data == (left_data+right_data) && isSumProperty(node.left) && isSumProperty(node.right)){
                return true;
            }
            else
                return false;

        }
    }
}
