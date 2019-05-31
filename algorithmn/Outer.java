package algorithmn;

public class Outer {

    private String text = "I am Outer private!";

    public static class Inner {

        private String text = "I am Inner private";

        public void printText() {
            System.out.println(text);
            //System.out.println(Outer.this.text);
        }

        //public static void printText1() {}
    }
}
