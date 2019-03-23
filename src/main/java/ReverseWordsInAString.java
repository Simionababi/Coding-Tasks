import java.util.Arrays;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        //System.out.println(reverseWordsOrder("simion ion iliev"));
        //System.out.println(reverseCharsInWords("simion ion ababi"));
        //System.out.println(reverseStringRecursive("simion"));
        //maximumChar("test");
        String str = "5simion4    3ion5      3m3isa3";
        reverseWordsPreservingSpaces(str);
    }

    static void reverseWordsPreservingSpaces(String str){
        String[] strings = str.split("\\b");
        System.out.println(Arrays.toString(strings));
        System.out.println(strings[0]);
        String result = "";
        String reversedWord = "";
        for (int i=0;i<strings.length;i++) {
            reversedWord = "";
            for (int j = strings[i].length() - 1; j >= 0; j--) {

                reversedWord += strings[i].charAt(j);
            }

            result += reversedWord;
        }




        System.out.println(result);
    }


    public static void maximumChar(String str){
        char[] ac = str.toCharArray();
        Arrays.sort(ac);
        System.out.println(ac[ac.length-1]);
    }

    public static String reverseWordsOrder(String str){
        String[] arrayOfStrings = str.split(" ");
        String result ="";
        for (int i=arrayOfStrings.length-1; i>=0;i--){
                if (i==arrayOfStrings.length-1) {
                    result +=arrayOfStrings[i];
                }else {
                    result = result + " " + arrayOfStrings[i];
                }
            }
        return result;
    }

    public static String reverseCharsInWords(String str){
        String[] arrayOfChars = str.split(" ");
        String reversedWord = "";
        String result = "";
        for (int i=0;i<arrayOfChars.length;i++) {
            for (int j=arrayOfChars[i].length()-1;j>=0;j--){
                reversedWord +=arrayOfChars[i].charAt(j);
                }
                if (i==0){
                result += reversedWord;
                }else {
                result =  result +" " + reversedWord;
                }
                reversedWord = "";
            }

        return result;
    }

    public static String reverseStringRecursive(String str){
        if (str == null || str.length()<=1){
            System.out.println(str);
            return str;
        }else {
            System.out.println(str);
            return reverseStringRecursive(str.substring(1)) + str.charAt(0);
        }
    }
}
