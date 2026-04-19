public class wordEnds {
    public static String wordEnds(String text, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();
        for (int i = 0; i <= text.length() - wordLen; i++) {
            if (text.startsWith(word, i)) {
                if (i > 0) result.append(text.charAt(i - 1));
                if (i + wordLen < text.length()) result.append(text.charAt(i + wordLen));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
    }
}
