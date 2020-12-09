package codewars;

import java.util.function.Function;

public class Opstrings1 {
    public static String rot(String strng) {
        return new StringBuilder(strng).reverse().toString();
    }

    public static String selfieAndRot(String strng) {
        int dotLength = strng.indexOf("\n");
        String dotPadding = new String(new char[dotLength]).replace("\0", ".");
        return strng.replaceAll("\n", dotPadding + "\n") + dotPadding + "\n" + dotPadding + rot(strng).replaceAll("\n", "\n" + dotPadding);
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
