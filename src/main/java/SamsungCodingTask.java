import java.util.Arrays;

public class SamsungCodingTask {
     public static void main(String[] args) {
        
    }
    
    static int minNumOfChars(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        int chars1Length = chars1.length-1;
        int chars2Length = chars2.length-1;
        int minNumberOfChars = 0;
        if (chars1Length>chars2Length)
           minNumberOfChars = chars1Length - chars2Length;
        else 
            minNumberOfChars = chars2Length - chars1Length;
        
        return minNumberOfChars;
    }
}
