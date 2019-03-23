public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialMethod(300));
    }

   private static int factorialMethod(int num){
        int result = 1;
        while (num > 0) {
            result*=num;
            num--;
        }
        return result;
    }
}
