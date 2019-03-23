public class FindTheSecondLargestNumberInArray {

    public static void main(String[] args) {
        int[] ar = {2,8,5,9,2,10};
        for (int i=0;i<2;i++){
            int maximumNum = i;
            for (int j=i+1;j<ar.length;j++){
                if (ar[maximumNum]<ar[j]){
                    maximumNum= j;
                }
            }
            if (i==1){
                System.out.println(ar[maximumNum]);
            }
            int temp = ar[i];
            ar[i]= ar[maximumNum];
            ar[maximumNum] = temp;

        }

    }
}
