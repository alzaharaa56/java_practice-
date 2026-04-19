public class CatDogBalanceTask {
    public static boolean catDog(String inputString) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < inputString.length() - 2; i++) {
            String sub = inputString.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            }
            if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public static void main (String[] args){
        System.out.println("catdog" + " " +catDog("catdog"));
        System.out.println("catcat" + "  "+ catDog("catcat"));
        System.out.println("1cat1cadodog" +"  " +catDog("1cat1cadodog"));
    }
}



