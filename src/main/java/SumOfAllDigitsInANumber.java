public class SumOfAllDigitsInANumber {

    public static void main(String[] args) {
        int n = 1234;
        int result = 0;
        char[] chars = String.valueOf(n).toCharArray();
        for (int i=0;i<chars.length;i++){
            result+=Character.getNumericValue(chars[i]);
        }
        System.out.println(result);
    }
}
