public class EndOther {
public static boolean endOther(String firstString, String secondString) {
String lowerFirst = firstString.toLowerCase();
String lowerSecond = secondString.toLowerCase();
return lowerFirst.endsWith(lowerSecond) || lowerSecond.endsWith(lowerFirst);
}

public static void main(String[] args) {
System.out.println(endOther("Hiabc", "abc"));
System.out.println(endOther("AbC", "HiaBc"));
}
}
