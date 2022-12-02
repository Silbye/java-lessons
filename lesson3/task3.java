package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 3, 14, 16, 7, 8, 15, 16, 2, 8, 0, -1, 99));
        System.out.printf("Minimal number is: %d\n", findMin(numbers));
        System.out.printf("Maximum number is: %d\n", findMax(numbers));
        System.out.printf("Average number is: %d\n", findAverage(numbers));
    }

    public static int findMin(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for (int num : numbers){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
    public static int findMax(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    public static int findAverage(ArrayList<Integer> numbers){
        int count = numbers.size();
        int summ = 0;
        for (int num : numbers){
            summ += num;
        }
        System.out.printf("Count is: %d\n", count);
        System.out.printf("Summ is: %d\n", summ);
        return summ/count;
    }
}
