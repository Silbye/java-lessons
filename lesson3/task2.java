package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class task2 {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 3, 14, 16, 7, 8, 15, 16, 2, 8, 0, -1, 99));
        
        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
            Integer number = iterator.next();
            if(number % 2 == 0){
                iterator.remove();
            }
        }

        System.out.println(numbers.toString());
    }
}
