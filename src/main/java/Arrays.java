public class Arrays {

    public static void main(String[] args) {
        int[] array1 = {7,5,3,7,6,34,65,1,78,12,36};
        //sortArray(array1);
        sortArraySelection(array1);
    }

    public static void sortArray(int[] array){
        int[] array2 = array;
        boolean flag = true;
        while (flag){
            flag = false;
        for (int i=0;i<array2.length-1;i++){
            for (int j=i+1; j<array.length;j++){
                if (array2[i]>array2[j]) {
                    int temp = array2[j];
                    array2[j] = array2[i];
                    array2[i] = temp;
                    flag = true;
                }
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array2));
    }

    static void sortArraySelection(int[] ar){
        int minElement = 0;
        for (int i=0;i<ar.length-1;i++){
            minElement = i;
            for (int j=i+1;j<ar.length;j++){
                if (ar[minElement]>ar[j]){
                        minElement=j;
                }
            }
            int temp=ar[i];
            ar[i] = ar[minElement];
            ar[minElement] = temp;
        }
        System.out.println(java.util.Arrays.toString(ar));
    }
}
