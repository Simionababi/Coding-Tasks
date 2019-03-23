public class AdjacentDuplicatesRemoval {

    public static void main(String[] args) {
        String str = "apaAajabbbcmcdbBbaae";
        removeAdjacentDuplicatesWithRegex(str);
        //removeAdjacentDuplicates(str);
    }

    static void removeAdjacentDuplicatesWithRegex(String str) {
        String str1 = str.toLowerCase().replaceAll("(.)(\\1)+", "");
        System.out.println(str1);
    }

    static void removeAdjacentDuplicates(String str) {
     char[] chars = str.toLowerCase().toCharArray();
     String result = "";

     for (int i=0;i<chars.length-1;i++){
         boolean flag = false;
         for (int j=i+1;j<chars.length;j++){
             if (chars[i]==chars[j]){
                 chars[j]=0;
                 flag=true;
             }else {
                 break;
             }
         }
         if (flag){
             chars[i]=0;
         }
     }
     for(char c : chars){
         result+=c;
     }
        System.out.println(result);
    }
}

