public class plusOut {
    public static String plusOut(String text, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (text.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
    }
}
