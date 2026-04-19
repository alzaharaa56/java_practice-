public class XyzThere {
    public static boolean xyzThere(String input) {
        if (input.startsWith("xyz")) return true;
        for (int i = 1; i < input.length() - 2; i++) {
            if (input.substring(i, i + 3).equals("xyz") && input.charAt(i - 1) != '.') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
    }
}
