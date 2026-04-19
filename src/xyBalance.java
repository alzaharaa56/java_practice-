public class xyBalance {
    public static boolean xyBalance(String text) {
        int lastX = text.lastIndexOf('x');
        int lastY = text.lastIndexOf('y');
        return lastX == -1 || lastY > lastX;
    }

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
    }
}
