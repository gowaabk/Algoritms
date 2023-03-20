import java.util.Arrays;
import java.util.Random;

public class heapSort {
    public static void main(String[] args) {
        int[] readyArray = fillArray(20, 1, 20);
        System.out.println("Not sorted:\t" + Arrays.toString(readyArray));
        sort(readyArray);
        System.out.printf("Sorted:\t\t" + Arrays.toString(readyArray));
    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapfy(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapfy(array, i, 0);
        }
    }

    private static void heapfy(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapfy(array, heapSize, largest);
        }
    }
    
    // Генерация новго массива длины len со значениями от min до max
    private static int[] fillArray(int len, int min, int max) {
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }
}
