package lesson1;

import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();

        char operation = getOperation();

        double result = calc(num1,num2,operation);

        System.out.println("Result: "+result);
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

    public static char getOperation(){
        System.out.println("Enter operation (+) (-) (*) (/):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error, please try entering operation again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                return result;
            case '-':
                result = num1-num2;
                return result;
            case '*':
                result = num1*num2;
                return result;
            case '/':
                if(num2 == 0){
                    System.out.println("Can't divide by zero!");
                    break;
                }
                else{
                    result = num1/num2;
                    return result;
                }
            default:
                System.out.println("Unknown operation, please try again");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
