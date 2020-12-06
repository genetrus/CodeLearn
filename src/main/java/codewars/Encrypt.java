package codewars;

public class Encrypt {
    public static String encryptThis(String text) {
        StringBuilder sb = new StringBuilder();
        int firstChar;
        char secondChar;
        char lastChar;
        if (text.length() > 0) {
            for (String s : text.split(" ")) {
                firstChar = s.charAt(0);
                sb.append(firstChar);

                if (s.length() == 1) {
                    sb.append(" ");
                } else if (s.length() == 2) {
                    sb.append(s.charAt(1)).append(" ");
                } else {
                    secondChar = s.charAt(1);
                    lastChar = s.charAt(s.length() - 1);
                    sb.append(lastChar).append(s, 2, s.length() - 1).append(secondChar).append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
