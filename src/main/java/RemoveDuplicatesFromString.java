import java.util.Arrays;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        int[] array = {2,7,4,9,4,7,0,2,1};
        removeAllDuplicatesWithRegex(5);

        }

    static void removeAllDuplicatesWithRegex(int rows){

        for (int i=0; i<rows;i++){

            for (int j=rows-1; j>i;j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
