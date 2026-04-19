public class xyzMiddle {
    public static boolean xyzMiddle(String text) {
        int length = text.length();
        if (length < 3) return false;
        int mid = length / 2;
        if (length % 2 != 0) {
            return text.substring(mid - 1, mid + 2).equals("xyz");
        } else {
            return text.substring(mid - 2, mid + 1).equals("xyz") ||
                    text.substring(mid - 1, mid + 2).equals("xyz");
        }
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
    }
}
