public class DoubleCharacterTask {

    public static String doubleChar(String originalText) {
        StringBuilder doubledResult = new StringBuilder();

        for (int i = 0; i < originalText.length(); i++) {
            char currentChar = originalText.charAt(i);

            doubledResult.append(currentChar).append(currentChar);
        }
        return doubledResult.toString();
    }
    public static void main(String[] args){
        System.out.println(doubleChar("The"));

    }
}
