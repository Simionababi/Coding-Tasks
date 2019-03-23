import java.util.*;

public class LongestPolindromeInAString {

    public static void main(String[] args) {
        String polindrome = "redivider simion deified civic ilievIon radar misaannani reviver level level rotor kayak reviver racecar redder madam refer";
        findTheLongetPolindrome(polindrome);
    }

    static void findTheLongetPolindrome(String str){
        String[] strings = str.split(" ");
        Map<String,Integer> mp = new LinkedHashMap<>();

        for (String s: strings){
                mp.put(s,s.length()-1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(mp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int i = o1.getValue().compareTo(o2.getValue());
                if (i > 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (Map.Entry<String,Integer> e: list){
            String revercedWord = "";
            for (int i=e.getKey().length()-1;i>=0;i--){
                revercedWord+= e.getKey().charAt(i);
            }
            if (revercedWord.equals(e.getKey())){
                System.out.println("this is the longest polindrome in the string "+e.getKey()+" length "+e.getValue());
            break;
            }
        }
    }
}
