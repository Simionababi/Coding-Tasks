import java.util.*;
import java.util.stream.Collectors;

public class SortedMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("one",1);
        map.put("three",3);
        map.put("two",2);
        map.put("ababi",4);

           sortMap(map);
    }

    static void sortMap(Map mp){
        List<Map.Entry<String,Integer>> list = new LinkedList<>(mp.entrySet());

        //list.sort((a,b)->a.getKey().compareTo(b.getKey()));

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int i = o1.getKey().compareTo(o2.getKey());
                if (i>0){
                    return -i;
                }
                if (i<0){
                   return Math.abs(i);
                }

                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println(list);




        Map<String,Integer> temp = new LinkedHashMap<String, Integer>();

        for (int i=0;i<list.size();i++){
            temp.put(list.get(i).getKey(),list.get(i).getValue());
        }


        System.out.println(temp);
        for (Map.Entry<String,Integer> entry: temp.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
