import java.util.*;

public class BalancedString {

    public static void main(String[] args) {
        String str = "[]([()])({})";

        if (isBalanced(str)){
            System.out.println(" main method is balanced");
        }else {
            System.out.println("is not balanced");
        }
    }

    private static boolean isBalanced(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<chars.length;i++){
            if (chars[i]=='[' || chars[i]=='(' || chars[i]=='{'){
                stack.push(chars[i]);
                continue;
            }
            if (chars[i]==')'){
                if (stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }
            if (chars[i]==']'){
                if (stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
            if (chars[i]=='}'){
                if (stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
