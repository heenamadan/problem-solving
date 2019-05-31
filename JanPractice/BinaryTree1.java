package JanPractice;

public class BinaryTree1 {
    static int i=5;

    BinaryTree1(){
        System.out.println(i++);
        System.out.println(i++);
    }

    boolean hasOnlyOneChild(int pre[], int size) {
        int nextDiff, lastDiff;

        for (int i = 0; i < size - 1; i++) {
            nextDiff = pre[i] - pre[i + 1];
            lastDiff = pre[i] - pre[size - 1];
            if (nextDiff * lastDiff < 0) {
                return false;
            };
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "/content/iwc/ww/global/ja/watch-collections8/aquatimer/iwiw329001---aquatimer-automatic/jcr:content";
        String s1 = str.split("/")[5];
        System.out.println("index-"+str.replace(s1, "en"));
        BinaryTree1 tree = new BinaryTree1();
        int pre[] = new int[]{8, 3, 5, 7, 6};
        int size = pre.length;
        long lStartTime = System.currentTimeMillis();
        /*if (tree.hasOnlyOneChild(pre, size) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/
       // tree.hasOnlyOneChild(pre, size);
        long lEndTime = System.currentTimeMillis();
        long output = lEndTime - lStartTime;

        //System.out.println("Elapsed time in milliseconds: " + output );
    }
}
