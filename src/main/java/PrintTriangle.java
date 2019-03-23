import com.sun.deploy.util.StringUtils;

public class PrintTriangle {

    public static void main(String[] args) {
        //printTrangle(10);
        string();
    }

    static void printTrangle(int height){

        for (int i=0;i<=height;i++){

            for (int j = height;j>i;j--){
                System.out.print(" ");
            }

            for (int j=0;j<=i;j++){
                System.out.print("^ ");
            }
            System.out.println();
        }

    }

    static void string(){
        String str1 = "123";
        String str2 = null;
        String result = str1+str2;
        System.out.println(str1.hashCode());
        int n = 123;
        String s =  String.valueOf(n);
    }
}
