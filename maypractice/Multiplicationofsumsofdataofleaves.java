package maypractice;

import java.util.LinkedList;

//Find multiplication of sums of data of leaves at same levels
class BSTNode
{
    int data;
    BSTNode left, right;
    BSTNode(int d)
    {
        data = d;
        left = null;
        right = null;
    }
}

public class Multiplicationofsumsofdataofleaves {

    BSTNode root;



    public static void main(String args[])
    {
        Multiplicationofsumsofdataofleaves tree = new Multiplicationofsumsofdataofleaves();
        tree.root = new BSTNode(2);
        tree.root.left = new BSTNode(7);
        tree.root.right = new BSTNode(5);
        tree.root.left.left = new BSTNode(8);
        tree.root.left.right = new BSTNode(6);
        tree.root.left.right.left = new BSTNode(1);
        tree.root.left.right.right = new BSTNode(11);
        tree.root.right.right = new BSTNode(9);
        tree.root.right.right.left = new BSTNode(4);
        tree.root.right.right.right = new BSTNode(10);
        /*tree.root = new BSTNode(2);
        tree.root.left = new BSTNode(7);
        tree.root.right = new BSTNode(5);
        tree.root.right.left = new BSTNode(9);*/
        System.out.println("The final product value : "
                + tree.sumAndMultiplyLevelData());
    }

    int sumAndMultiplyLevelData()
    {
        long startTime = System.currentTimeMillis();
         sumAndMultiplyLevelData(root);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("duration:"+duration);
        return 0;
    }

    int sumAndMultiplyLevelData(BSTNode node)
    {
        // Tree is empty
        if (node == null) {
            return 0;
        }

        int mul = 1; /* To store result */

        // Create an empty queue for level order traversal
        LinkedList<BSTNode> q = new LinkedList<BSTNode>();

        // Enqueue Root and initialize height
        q.add(node);

        // Do level order traversal of tree
        while (true) {

            // NodeCount (queue size) indicates number of Nodes
            // at current level.
            int NodeCount = q.size();

            // If there are no Nodes at current level, we are done
            if (NodeCount == 0) {
                break;
            }

            // Initialize leaf sum for current level
            int levelSum = 0;

            // A boolean variable to indicate if found a leaf
            // Node at current level or not
            boolean leafFound = false;

            // Dequeue all Nodes of current level and Enqueue all
            // Nodes of next level
            while (NodeCount > 0) {
                BSTNode node1;
                node1 = q.poll();

                /* if Node is a leaf, update sum at the level */
                if (isLeaf(node1)) {
                    //leafFound = true;
                    levelSum += node1.data;
                }


                // Add children of Node
                if (node1.left != null) {
                    q.add(node1.left);
                }
                if (node1.right != null) {
                    q.add(node1.right);
                }
                NodeCount--;
            }

            // If we found at least one leaf, we multiply
            // result with level sum.
            if (levelSum!=0) {
               // or if(leafFound)
                mul *= levelSum;
            }
        }

        return mul;  // Return result
    }

    boolean isLeaf(BSTNode node)
    {
        return ((node.left == null) && (node.right == null));
    }
}
