package org.example;

import java.util.Arrays;

public class MyCustomSort {

        public static void main(String[] args) {
            int[] array = {10, 20, 56, 10, 25, 20, 56, 458, 25};
            MySort(array);
            System.out.println("Sorted Array: " + Arrays.toString(array));
        }

        private static void MySort(int[] array) {


            for (int i = 0; i < array.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }



}
