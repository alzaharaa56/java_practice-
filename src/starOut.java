public class starOut {
    public static String starOut(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '*') continue;
            if (i > 0 && text.charAt(i - 1) == '*') continue;
            if (i < text.length() - 1 && text.charAt(i + 1) == '*') continue;
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
    }
}
