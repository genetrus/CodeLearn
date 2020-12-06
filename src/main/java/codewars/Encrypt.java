package codewars;

public class Encrypt {
    public static String encryptThis(String text) {
        StringBuilder sb = new StringBuilder();
        if (text.length() > 0) {
            for (String s : text.split(" ")) {
                sb.append((int)s.charAt(0));
                if (s.length() == 1) {
                    sb.append(" ");
                } else if (s.length() == 2) {
                    sb.append(s.charAt(1)).append(" ");
                } else {
                    sb.append(s.charAt(s.length() - 1)).append(s, 2, s.length() - 1).append(s.charAt(1)).append(" ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
