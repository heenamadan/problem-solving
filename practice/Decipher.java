package practice;

public class Decipher {



    public static final String decode(final int key, final String encoded) {
        final int len = encoded.length();
        // prepare a space to store the decoded value
        final char[] decoded = new char[len];
        for (int i = 0; i < len; i++) {
            // use i+1 here since the algorithm has the first char at position 1, not 0.
            decoded[i] = decodeChar1(encoded.charAt(i));
            decoded[i] = decodeChar(encoded.charAt(i), i + 1, key);
        }
        // convert the decoded chars back to a String.
        return new String(decoded);
    }

    private static char decodeChar(final char encoded, final int position, final int key) {
        // modulo 26 eliminates multiple wrap-arounds.
        int rotate = (3 * position + key) % 26;
        // apply the rotation shift to the input
        int decval = (encoded - 'A') + 26 - rotate;
        // use another % 26 to keep the letters in range.
        return (char)('A' + (decval % 26));
    }

    private static char decodeChar1(final char encoded) {
        int rotate = 3;

        return (char)(encoded + rotate);
    }

    public static void main(String args[])
    {
        System.out.println(Decipher.decode(0,"ABC"));

    }


}
