public class getSandwich {
    public static String getSandwich(String text) {
        int first = text.indexOf("bread");
        int last = text.lastIndexOf("bread");
        if (first != -1 && last != -1 && first != last) {
            return text.substring(first + 5, last);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }
}