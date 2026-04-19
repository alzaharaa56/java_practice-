public class bobThere {
    public static boolean bobThere(String text) {
        for (int i = 0; i < text.length() - 2; i++) {
            if (text.charAt(i) == 'b' && text.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
    }
}
