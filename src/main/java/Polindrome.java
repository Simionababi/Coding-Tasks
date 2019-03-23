import java.util.Collections;
import java.util.LinkedList;

public class Polindrome {
    public static void main(String[] args)
    {
        isPolindrome("10 801 10801 108 01");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("simion");
        linkedList.add("mihai");
        Collections.reverse(linkedList);
    }

    public static void isPolindrome(String str){
        String reversed = "";
        for (int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        //new StringBuilder(str).reverse();
        if (!reversed.equals(str)){
            System.out.println("is not polindrome");
        }else {
            System.out.println("is polindrome");
        }

    }

}
