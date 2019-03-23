
public class Fibonacci {
    public static void main(String[] args) {
            int number = 6;
        System.out.println(fibonacciRecursive(number));

       /* for (int i=0;i<=number;i++){
            System.out.println(fibonacci2(i));
        }*/
    }

    public static int fibonacci2(int number){
        if (number==1 || number == 2){
            return 1;
        }
        if (number == 0){
            return 0;
        }
        int fib1=1, fib2 = 1, fibonacci = 0;
        for (int i=3;i<=number;i++){
            fibonacci = fib1+fib2;
            fib1 = fib2;
            fib2 = fibonacci;

        }
        return fibonacci;
    }

    public static int fibonacciRecursive(int number){
        if (number==1 || number == 2){
            return 1;
        }
        if (number == 0){
            return 0;
        }
        return fibonacciRecursive(number -1) + fibonacciRecursive(number-2);
    }
}
