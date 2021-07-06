package task_2;

import java.util.Arrays;

public class QuickSort {
    public static void quickSortArr(int[] array, int low, int high) {
        if (array.length == 0) return;

        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSortArr(array, low, j);
        if (high > i) quickSortArr(array, i, high);
    }

    public static int[] quickSort(int[] arr){
        int[] newArr = arr.clone();
        quickSortArr(newArr, 0, arr.length - 1);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.print("Before - ");
        System.out.println(Arrays.toString(arr));

        int[] newArr = quickSort(arr);
        System.out.print("After - ");
        System.out.println(Arrays.toString(newArr));
    }
}

