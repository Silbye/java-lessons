package lesson4;

import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        boolean firstEntered = false;
        boolean secondEntered = false;

        double[] numbers = getNumbers(firstEntered, secondEntered);

        char operation = getOperation();

        double result = calc(numbers,operation);

        System.out.println("Result: "+result);
    }

    public static double[] getNumbers(boolean firstEntered, boolean secondEntered){
        double[] Numbers = new double[2];

        boolean isDone = false;

        while(isDone != true){
            while(firstEntered != true){
                System.out.println("Enter First number:");
                String entered = scanner.next();
                try{
                    Numbers[0] = Integer.parseInt(entered);
                    firstEntered = true;
                    secondEntered = false;
                }
                catch(Exception e){
                    System.out.println("Error, please enter a number");
                }
            }
            
            while(secondEntered != true){
                System.out.println("Enter Second number:");
                String entered = scanner.next();
                try{
                    Numbers[1] = Integer.parseInt(entered);
                    secondEntered = true;
                    isDone = true;
                }
                catch(Exception e){
                    if(entered.contains("delete")){
                        System.out.println("First number deleted");
                        firstEntered = false;
                        secondEntered = true;
                    }
                    else{
                        System.out.println("Error, please enter a number");
                    }
                }
            }
        }
        
        return Numbers;
    }

    public static char getOperation(){
        System.out.println("Enter operation (+) (-) (*) (/) (d):");
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

    public static double calc(double[] numbers, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = numbers[0]+numbers[1];
                return result;
            case '-':
                result = numbers[0]-numbers[1];
                return result;
            case '*':
                result = numbers[0]*numbers[1];
                return result;
            case '/':
                if(numbers[1] == 0){
                    System.out.println("Can't divide by zero!");
                    break;
                }
                else{
                    result = numbers[0]/numbers[1];
                    return result;
                }
            case 'd':
                System.out.println("Second number deleted");
                result = calc(getNumbers(true, false), getOperation());
            default:
                System.out.println("Unknown operation, please try again");
                result = calc(numbers, getOperation());
        }
        return result;
    }
}

