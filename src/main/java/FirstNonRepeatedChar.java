public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        //firstNonRepeatedChar("olw2ojk2",2);
        repeatedChar("simomndho",2);
    }

    static void firstNonRepeatedChar(String str, int number){
        char[] chars = str.toCharArray();
        boolean flag = true;
        int counter = 0;
        for (int i=0; i<chars.length-1;i++){
            for (int j=i+1;j<chars.length;j++){
                if (chars[i]==chars[j]){
                    flag=false;
                }
            }
            if (flag){
                counter++;
            }
            if (counter==number){
                System.out.println("this is the second not repeated character " + chars[i]);
                break;
            }
            flag = true;
        }
    }

    static void repeatedChar(String str,int num){
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int i=0; i<chars.length-1;i++){
            for (int j=i+1;j<chars.length;j++){
                if (chars[i]==chars[j]){
                    counter++;
                    break;
                }
            }
            if (counter==num){
                System.out.println("this is the "+num+ " repeated char "+chars[i]);
                break;
            }
        }
    }
}
