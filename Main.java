package CA530;

import java.util.Random;

import static CA530.HeapSort.heapSort;
import static java.lang.Math.E;

public class Main {
    public static void main(String[] args){
        int n = 200000;
        int[] myList = new int[n];
        Random rand = new Random();

        for(int i = 0; i < 200000; i++){
            myList[i] = rand.nextInt(200000);
        }

        long startTime = System.currentTimeMillis();
            heapSort(myList);
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime/1000 + " seconds");
    }
}
