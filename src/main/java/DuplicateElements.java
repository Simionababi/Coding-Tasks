import java.util.*;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        String testString = "sim  4,5,7,6,5,4,sim ion aseli ion vanja algo static algo misa algo";
        findDuplicateElements(testString);
        //findDuplicateElementWithASet(testString);
    }

    public static void findDuplicateElements(String str){
        String[] strings = str.split("\\s|\\,");
        Map<String,Integer> map = new HashMap<String, Integer>();

        for (int i=0; i<strings.length; i++){
            if (!map.containsKey(strings[i])){
                map.put(strings[i],1);
            }else {
                map.put(strings[i],map.get(strings[i])+1);
            }
        }
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        int maxValue =  Collections.max(map.values());
        for (Map.Entry<String,Integer> e : set) {
         if (e.getValue() == maxValue){
             System.out.println("this is the most repeated word in the string " + e.getValue() + e.getKey());
         }
        }
    }

    public static void findDuplicateElementWithASet(String str){
        String[] strings = str.split("\\s|\\,");
        Set<String> set = new HashSet<String>();
        for (String s: strings) {
            if (!set.add(s)){
                System.out.println("this is duplicate " + s);
            }
        }
    }
}
