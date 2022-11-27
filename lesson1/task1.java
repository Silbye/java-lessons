package lesson1;

import java.io.IOException;
import java.util.Scanner;

public class task1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int N = getInt();
        System.out.println(triangleNumber(N));
        System.out.println(findFactorial(N));
    }
    public static int getInt(){
        System.out.println("Enter number:");
        int num = 0;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Error, please try entering a number again");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static int triangleNumber(int N) {
        int result = 0;
        for (int i = 1; i < N+1; i++) {
            result += i;
        }
        return result;
    }
    public static int findFactorial(int N) {
        int result = 1;
        for (int i = 1; i < N+1; i++) {
            result *= i;
        }
        return result;
    }
}
