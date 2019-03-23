import java.util.*;
import java.util.Arrays;

public class DeleteAllDuplicatesFromArrayOrString {

    public static void main(String[] args) {
        int[] a={1,5,9,6,1,5,7,1,5,1,9,5,9,1};
        //System.out.println(Arrays.toString(removeAllDuplicatesFromArray(a)));
        duplicatedPairs(a);
    }

    static int[] removeAllDuplicatesFromArray(int[] ar){
       for (int i=0;i<ar.length-1;i++){
           boolean flag = false;
           for (int j=i+1;j<ar.length;j++){
               if (ar[i]==ar[j]){
                   flag = true;
                   ar[j]=0;
               }
           }
           if (flag){
               ar[i]=0;
           }
       }
       return ar;
    }

    //return number of duplicated pairs
    static void duplicatedPairs(int [] ar){

        Map<Integer,Integer> map = new HashMap<>();
        for (int n: ar) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

            Set<Map.Entry<Integer,Integer>> set = map.entrySet();
            for (Map.Entry<Integer,Integer> e: set){
                if (e.getValue()>1){
                    if (e.getValue()%2==0){
                        System.out.println(" number "+e.getKey()+" has repeated pairs: "+ e.getValue()/2);
                    }else {
                        System.out.println(" number "+e.getKey()+" has repeated pairs: "+ (e.getValue()-1)/2);
                    }
                }
            }

        System.out.println(map);
    }
}
