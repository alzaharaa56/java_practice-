public class CountCodeTask {
    public static int countCode(String text) {
        int count = 0;
        for (int i = 0; i < text.length() - 3; i++) {
            if (text.substring(i, i + 2).equals("co") && text.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("cozexxcope"));
    }
}