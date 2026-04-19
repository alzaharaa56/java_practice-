public class zipZap {
    public static String zipZap (String text){
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i< text.length(); i++){
            result.append(text.charAt(i));

            if(i>0 && i< text.length()-1 && text.charAt(i-1)=='z' && text.charAt(i+1)== 'p'){
                result.deleteCharAt(result.length()-1);

            }

        }
        return result.toString();

    }

    public static void main (String[] args){

        System.out.println(zipZap("zipXzip"));


    }







}
