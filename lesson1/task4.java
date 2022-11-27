package lesson1;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        String equ = "?1+1?=19";
        String[] splittedEqu = equ.split("\\+|=");

        System.out.println(Arrays.toString(splittedEqu));

        String num1 = splittedEqu[0];
        String num2 = splittedEqu[1];

        int result = Integer.parseInt(splittedEqu[2]);

        findPossible(num1, num2, result);
    }

    public static void findPossible(String num1, String num2, int result){
        int[] possible = new int[2];
        int x = 0;
        int y = 0;
        boolean possibleFound = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                x = Integer.parseInt(num1.replace("?", Integer.toString(i)));
                y = Integer.parseInt(num2.replace("?", Integer.toString(j)));
                if(x + y == result){
                    possible[0] = x;
                    possible[1] = y;
                    possibleFound = true;
                    System.out.println(Arrays.toString(possible));
                }
                else{
                    continue;
                }
            }
        }
        if(possibleFound == false){
            System.out.println("No possible solutions found!");
        }
    }
}
