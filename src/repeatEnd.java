public class repeatEnd {
    public static String repeatEnd(String text, int n) {
        String lastPart = text.substring(text.length() - n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
    }
}