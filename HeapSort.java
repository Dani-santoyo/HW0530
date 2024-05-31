package CA530;
import java.util.Random;

public class HeapSort {
    public static void heapSort(int[] list) {
        Heap<int> heap = new Heap<int>();
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }
}