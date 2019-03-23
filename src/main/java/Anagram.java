import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String firstString = "lI ST EN   ";
        String secondString = "silen  T";
        if (isAnagram(firstString, secondString)){
            System.out.println("strings are anagram");
        }
        else {
            System.out.println("strings are not anagram");
        }

    }

    public static boolean isAnagram(String firstWord, String secondWord){

        if(firstWord==null || firstWord.trim().isEmpty() ||
        secondWord==null || secondWord.trim().isEmpty()) {
            return false;
        }
        char[] chars1 = firstWord.toLowerCase().replaceAll("\\s","").toCharArray();
        char[] chars2 = secondWord.toLowerCase().replaceAll("\\s","").toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (!Arrays.equals(chars1,chars2)){
            return false;
        }

        return true;
    }
}
