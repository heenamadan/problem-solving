package AmazonBhask;

import java.util.ArrayList;

public class NaryTreeNode {

    final int data;
    final int N;
    private final ArrayList<NaryTreeNode> children;



    public NaryTreeNode(int data, int n) {
        this.data = data;
        this.N = n;
        children = new ArrayList<>(n);
    }

    private boolean addChild(NaryTreeNode node) {
        if (children.size() < N) {
            return children.add(node);
        }

        return false;
    }



    public boolean addChild(int label) {
        return addChild(new NaryTreeNode(label, N));
    }

    public ArrayList<NaryTreeNode> getChildren() {
        return new ArrayList<>(children);
    }

    public NaryTreeNode getChild(int index) {
        if (index < children.size()) {
            return children.get(index);
        }

        return null;
    }

    public static void print(NaryTreeNode root, NaryTreeNode givenNode) {
        printUtil(root, 0, givenNode);
    }

    private static void printUtil(NaryTreeNode node, int depth) {
        for (NaryTreeNode child : node.getChildren()) {
            System.out.println(child.data);
            printUtil(child, depth + 1);
        }
    }

    public static void getChildren(NaryTreeNode node, int depth) {


        for (NaryTreeNode child : node.getChildren()) {
            printUtil(child, depth + 1);
        }
    }


    public static void printUtil(NaryTreeNode node, int depth, NaryTreeNode givenNode) {

        //System.out.println(node.data);
        for (NaryTreeNode child : node.getChildren()) {
            if( child.data ==  givenNode.data)
                printUtil(child, depth+1);
        }
    }


    public static int immediateSmallerElement(int input, NaryTreeNode node, NaryTreeNode resultant){



        if(node==null){
            return 0;

        }
        else if(node.data == 0){
            return 0;
        }

        else {

            immediateSmallerElementUtil(input , node , resultant);


        }

        return resultant.data;

    }


    static void immediateSmallerElementUtil(int input, NaryTreeNode node, NaryTreeNode resultant){

        if(node ==null){
            return;
        }

        if(node.data> resultant.data && node.data< input){

            resultant = node;

        }


        int numChildren = node.children.size();

        for(int i=0;i<numChildren;i++){

            immediateSmallerElementUtil(input, node.getChild(i), resultant);

        }
        return;
    }

    public static int print(NaryTreeNode root, int sum) {

         print(root, 0, sum);
        return sum;
    }

    private static void  print(NaryTreeNode node, int depth, int sum) {



        for (NaryTreeNode child : node.getChildren()) {
            sum= sum+child.data;
            System.out.println("now child is "+ child.data+"----"+"sum is"+sum);
            print(child, depth + 1, sum);
        }

    }


}
