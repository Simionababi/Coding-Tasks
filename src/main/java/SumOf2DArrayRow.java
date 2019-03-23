import java.util.Arrays;

public class SumOf2DArrayRow {

    public static void main(String[] args) {
        int[][] ar = {{2,3,6,8,4,5},{3,2,5,6,4},{2,3,4},{1,2,3},{5,6,7}};
        int[] array = {2,7,4,9,54,0,2,8,5};
        int row = 2;
        findSumOfRow(ar,row);
        selectionSort(array);
    }

    static void findSumOfRow(int[][] twoDArray, int row){
        int sum=0;
        for (int j=0;j<twoDArray[row].length;j++){
            sum+=twoDArray[row][j];
        }
        System.out.println(sum);
    }

    static void selectionSort(int[] ar){
        for (int i=0;i<ar.length-1;i++){
            int minElement = i;
            for (int j=i+1;j<ar.length;j++){
                if (ar[minElement]<ar[j]){
                    minElement = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[minElement];
            ar[minElement] = temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}
