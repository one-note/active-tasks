package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{10, 20, 58, 45, 10, 58};
        bubbleSort(arr);
        for (int n : arr
        ) {
            System.out.println(n);
        }
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }
}
