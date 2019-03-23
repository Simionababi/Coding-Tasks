public class IsPrimeNumber {

    public static void main(String[] args) {
        //isPrimeNumber(12);
        printAllPrimeNumbers(1,20);

    }

    public static void isPrimeNumber(int num){
        boolean flag = false;
        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println(num+" is not prime number");
        }
        else{
            System.out.println(num+ " is prime number");
        }
    }

    public static void printAllPrimeNumbers(int from, int to){

        for (int i=from;i<=to;i++){
            if (i==1){
                continue;
            }
            boolean flag=true;
            for (int j=2; j<i;j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }

    }
}
