import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LongestUniqueSubsequence {

    public static void main(String[] args) {
        String s = "abcahjkcbd";
        List<String> list = new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        list.add("bob");
        list.add("dan");
        list.add("alice");
        list.add("mike");
        list.add("alice");
        list.add("bob");
        longestSubsequence(list);
        //input list of strings : alice, bob, charlie, bob, dan, alice, mike
        //output: charlie->bob->dan->alice->mike
    }

    static void longestSubsequence(List<String> list){
        int maxLength = 0;
        HashSet<String> set = new HashSet<>();
        //[alice, bob, charlie, bob, dan, alice, mike, alice, bob]
        int i = 0;
        int j = 0;
        while (j < list.size()) {
            if (!set.contains(list.get(j))) {
                System.out.println(list.get(j));
                set.add(list.get(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(list.get(i));
                System.out.println(set);
                i++;
            }
        }
        System.out.println(maxLength);
    }
}
