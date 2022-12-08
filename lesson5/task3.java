package lesson5;

import java.util.Random;

public class task3 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] array = new int[rand.nextInt(10, 26)];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(1, 21);
        }
        System.out.println("Original array is: ");
        PrintArray(array);
        task3 ob = new task3();
        ob.sort(array);
        System.out.println("Sorted array is: ");
        PrintArray(array);
    }

    public void sort(int[] array){
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i=n-1; i>=0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    public void heapify(int[] array, int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        if (l < n && array[l] > array[largest]){
            largest = l;
        }
        if (r < n && array[r] > array[largest]){
            largest = r;
        }
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }

    static void PrintArray(int[] array){
        for(int item : array){
            System.out.print(item+ " ");
        }
        System.out.println();
    }
}
