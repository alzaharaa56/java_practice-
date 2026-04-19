public class prefixAgain {
    public static boolean prefixAgain(String text, int n) {
        String prefix = text.substring(0, n);
        return text.substring(n).contains(prefix);
    }

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
    }
}
