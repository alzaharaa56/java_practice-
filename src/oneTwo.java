public class oneTwo {
    public static String oneTwo(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length() - 2; i += 3) {
            result.append(text.substring(i + 1, i + 3)).append(text.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(oneTwo("tcagdo"));
    }
}
