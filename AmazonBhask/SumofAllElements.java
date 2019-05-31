package AmazonBhask;

public class SumofAllElements {

    public static void main(String[] args) {


        NaryTreeNode root1 = new NaryTreeNode(20, 5);
        root1.addChild(2);
        root1.addChild(34);
        root1.addChild(50);
        root1.addChild(60);
        root1.addChild(70);


        root1.getChild(0).addChild(15);
        root1.getChild(0).addChild(20);

        root1.getChild(1).addChild(30);

        root1.getChild(2).addChild(40);
        root1.getChild(2).addChild(100);
        root1.getChild(2).addChild(120);

        root1.getChild(0).getChild(1).addChild(25);
        root1.getChild(0).getChild(1).addChild(50);


        System.out.println(NaryTreeNode.print(root1, root1.data));
    }


    //private static void
}
