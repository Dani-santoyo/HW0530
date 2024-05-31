package CA530;
import java.util.Random;
public class InsertionSort {
    public static void main(String[] args){
        int n = 200000;
        int[] myList = new int[n];
        Random rand = new Random();

        for(int i = 0; i < 200000; i++){
            myList[i] = rand.nextInt(200000);
        }
        long startTime = System.currentTimeMillis();
        insertionSort(myList, 200000);
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime/1000);
    }

    public static void insertionSort(int[] arr, int n){
        int i, key, j;
        for (i = 1; i < n; i++){
            key = arr[i];
            j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
