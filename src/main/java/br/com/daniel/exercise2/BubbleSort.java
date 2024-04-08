package br.com.daniel.exercise2;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) throws Exception {
        int arraySize = array.length;
        if (arraySize == 0) throw new Exception("O array não pode ser vazio");
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int provisionalValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = provisionalValue;
                }
            }
        }
        return array;
    }

    public static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
