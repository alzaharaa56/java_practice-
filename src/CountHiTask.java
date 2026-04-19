public class CountHiTask {

    public static int countHi (String phrase){
        int count =0;
        for (int i =0 ;i<phrase.length() -1 ; i++){
            if (phrase.substring(i, i+2).equals("hi")){
                count++;

            }
        }
        return count;


    }
    public static void main(String[] args){
        System.out.println(countHi("abc hi ho"));


    }












}
