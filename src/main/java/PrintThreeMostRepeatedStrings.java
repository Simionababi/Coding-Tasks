import java.util.*;

public class PrintThreeMostRepeatedStrings {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("simion");
        list.add("aseli");
        list.add("alex");
        list.add("dmitriy");
        list.add("simion");
        list.add("aseli");
        list.add("simion");
        printThreeTopDuplicates(list);

    }

    static void printThreeTopDuplicates(List<String> l){
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String s: l){
            if (map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("first top string "+list.get(list.size()-1).getKey()+" second top element "+ list.get(list.size()-2).getKey());
    }
}
