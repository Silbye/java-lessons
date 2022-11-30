package lesson2;

import java.util.Scanner;
import java.util.logging.*;

public class task4 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        Logger LOG = Logger.getLogger(task2.class.getName());
        LOG.setLevel(Level.INFO);

        ConsoleHandler ch = new ConsoleHandler();
        LOG.addHandler(ch);
        
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        FileHandler fh;
        try{
            fh = new FileHandler("lesson2/calclogs.log");

            LOG.addHandler(fh);
            fh.setFormatter(sf);
        }
        catch (Exception e) {
            LOG.log(Level.WARNING, "File logging doesn't work", e);
        }

        int num1 = getInt(LOG);
        int num2 = getInt(LOG);

        char operation = getOperation(LOG);

        int result = calc(num1,num2,operation,LOG);

        System.out.println("Result: "+result);
    }

    public static int getInt(Logger LOG){
        System.out.println("Enter number:");
        int num = 0;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
            LOG.info(Integer.toString(num));
        } else {
            LOG.info("Error, please try entering a number again");
            System.out.println("Error, please try entering a number again");
            scanner.next();
            num = getInt(LOG);
        }
        return num;
    }

    public static char getOperation(Logger LOG){
        System.out.println("Enter operation (+) (-) (*) (/):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
            LOG.info(Character.toString(operation));
        } else {
            LOG.info("Error, please try entering operation again");
            System.out.println("Error, please try entering operation again");
            scanner.next();
            operation = getOperation(LOG);
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation, Logger LOG){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                LOG.info(Integer.toString(result));
                return result;
            case '-':
                result = num1-num2;
                LOG.info(Integer.toString(result));
                return result;
            case '*':
                result = num1*num2;
                LOG.info(Integer.toString(result));
                return result;
            case '/':
                if(num2 == 0){
                    LOG.info("Can't divide by zero!");
                    System.out.println("Can't divide by zero!");
                    break;
                }
                else{
                    result = num1/num2;
                    LOG.info(Integer.toString(result));
                    return result;
                }
            default:
                LOG.info("Unknown operation, please try again");
                System.out.println("Unknown operation, please try again");
                result = calc(num1, num2, getOperation(LOG), LOG);
        }
        return result;
    }
}
