package Sort;

import java.util.Arrays;

import static Sort.BubbleSort.bubbleSort;
import static Sort.SelectSort.selectSortAscending;
import static Sort.InsertSort.insertionSort;

public class Main {
    public static void main(String[] args) {
        int arraySize = 10000;
        int[] array = new int[arraySize];
        generate(array, arraySize);
        long startTime = System.currentTimeMillis();
        Arrays.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Arrays.sort times = " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble sort times = " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        selectSortAscending(array);
        endTime = System.currentTimeMillis();
        System.out.println("Select Sort = " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        insertionSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("insert Sort times = " + (endTime - startTime));
    }
    public static void generate(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
    }
}