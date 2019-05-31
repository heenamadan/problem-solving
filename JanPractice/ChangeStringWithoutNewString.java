package JanPractice;
import java.lang.reflect.Field;
public class ChangeStringWithoutNewString {

    public static void main(final String[] args) throws Exception {
        final String s = "Immutable String";
        PrintUtils.print(s);

        final Class<String> type = String.class;
        final Field valueField = type.getDeclaredField("value");
        valueField.setAccessible(true);

        final char[] value = (char[]) valueField.get(s);
        value[0] = 'i';
        value[10] = 's';
        PrintUtils.print(s);

        System.arraycopy("Mutable String".toCharArray(), 0, value, 0, 14);
        PrintUtils.print(s);

        valueField.set(s, "Mutable String".toCharArray());
        PrintUtils.print(s);
    }
}
