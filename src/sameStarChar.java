public class sameStarChar {
    public static boolean sameStarChar(String text) {
        for (int i = 1; i < text.length() - 1; i++) {
            if (text.charAt(i) == '*' && text.charAt(i - 1) != text.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
    }
}
