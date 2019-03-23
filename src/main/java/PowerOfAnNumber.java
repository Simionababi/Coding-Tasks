public class PowerOfAnNumber {

    public static void main(String[] args) {
        System.out.println(pow(3,5));
        System.out.println(squareRoot(9));
    }

    static long pow(int num, int pow){
        int x = num;
        while (pow>1){
            x= num * x;
            pow--;
        }
        return x;
    }

    static double squareRoot(int num){
        if(num==0||num==1){
            return num;
        }
        int result = 1;
        int i=1;
        while (result<=num){
            i++;
            result = i*i;
        }

                return i-1;
    }
}
