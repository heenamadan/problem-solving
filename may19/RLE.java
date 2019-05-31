package may19;

public class RLE {

    public static void main(String [] args) {
        String a = "aaabbcccd";
        String str = "heena madan";
        str = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println(str);
        StringBuilder sb = new StringBuilder();

        // Establish invariant for k == 0.
        int runLen = 1;
        char runChar = a.charAt(0);

        // Advance k, re-establishing invariant for each step.
        for (int k = 1; k < a.length(); k++) {
            if (a.charAt(k) == runChar) {
                ++runLen;
            } else {
                sb.append(runChar).append(runLen);
                runLen = 1;
                runChar = a.charAt(k);
            }
        }
        // Output the final run to get from invariant to required answer.
        sb.append(runChar).append(runLen);
        System.out.println(sb.toString());
    }
}
