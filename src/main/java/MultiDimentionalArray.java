import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class MultiDimentionalArray {


    public static void main(String[] args) {
        int[][] array = {{1,-29,5,-83,0,-3,8},
                {34,45,2,4,1,0,-6},
                {3,54,-2,0,8,4,5},
                {2,4,8,2,4,1,4},
                {0,7,5,0,8,4,3},
                {7,34,67,36,1,537,86},
                {1,5,3,7,5,4,5}};

        //sortRowsIn2DArray(array);
        //printTriangle(5);
        //printTriangleString(5);
        int[] array2 = {1,2,4,5,6};
        //findMissingNumber(array2);
        //countNegativeNumbersInArray(array);
        int[][] arrayMethod = sortColumns(array,0);
        for (int[] a: arrayMethod) {
            System.out.println(Arrays.toString(a));
        }

    }

    static void sortRowsIn2DArray(int[][] array){
        boolean flag = true;

        while (flag){
            flag = false;
        for (int row=0;row<array.length;row++) {
            for (int column = 0; column < array[row].length - 1; column++) {
                for (int j = column + 1; j < array[row].length; j++)
                    if (array[row][column] > array[row][j]) {
                        int temp = array[row][column];
                        array[row][column] = array[row][j];
                        array[row][j] = temp;
                        flag = true;
                    }
            }
        }
        }
        System.out.println(Arrays.deepToString(array));
    }

    static void printTriangle(int row){
        int[][] array = new int[row][row];
        int middleRight = array.length/2;
        int middleLeft = array.length/2;
        int middle = array.length/2;
        for (int i =0; i <array.length-2;  i++) {

            array[i][middle]=1;
            if (i!=0) {
                middleRight++;
                array[i][middleRight] = 1;


                middleLeft--;
                array[i][middleLeft] = 1;
            }
            System.out.println(Arrays.toString(array[i]));
            }

        for (int[] ar: array){
            System.out.println(Arrays.toString(ar));
        }
    }

    static void printTriangleString(int height) {

        for (int i=0; i<height; i++){

            for (int j=1;j<height-i;j++){
                System.out.print("1");
            }
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void findMissingNumber(int[] array){
        for (int i=0;i<array.length; i++){
            if (array[i] != array[i-1]+1){
                System.out.println("this is the missing number " +(i+1));
                break;
            }
        }
    }

    static void countNegativeNumbersInArray(int[][] ar){
        int count=0;
        int column=0;
        for (int i=0;i<ar.length;i++){
            count = 0;
            for (int n=0; n<ar[i].length;n++) {
                column=n;
                for (int j = n; j <= n; j++) {
                    if (ar[i][n] < 0) {
                        count++;
                    }
                }
            }
            System.out.println("number of negative numbers in column: " +(column+1)+" is " +count);
        }
        for (int[] a : ar){
            System.out.println(Arrays.toString(a));
        }
    }

    static int[][] sortColumnsIn2DArray(int[][] ar){
        int[][] newArray ;
        int[][] ar2 = new int[7][7];
        //for (int i=0;i<ar.length;i++){

                sortColumns(ar,0);

                //for (int j =0; j<ar.length;j++){
                   // for (int n=i;n<=i;n++){
                        //ar2[j][n]=newArray[j][n];
                    //}
                //}
            //for (int[] a: ar2){
               // System.out.println(Arrays.toString(a));
            //}
        //}
        //sortColumns(ar,0);
        return ar;
    }

    static int[][] sortColumns(int[][] ar, int col) {
        Arrays.sort(ar, new Comparator<int[]>() {
            @Override
            public int compare(int[] ar1, int[] ar2) {
                System.out.println(ar1[col] + " " + ar2[col]);
                if (ar1[col] > ar2[col]) {
                    return 1;
                }else {
                    return -1;

                }
            }
        });


        return ar;

    }
 }

