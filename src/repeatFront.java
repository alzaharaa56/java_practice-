public class repeatFront {
    public static String repeatFront(String text, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = n; i > 0; i--) {
            result.append(text.substring(0, i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }
}
