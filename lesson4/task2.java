package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        LinkedList<String> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        System.out.println("Hello!");

        while(isDone != true){
            System.out.print("Select an option: 1 - enqueue, 2 - dequeue, 3 - first: ");
            String entered = scanner.next();
            if(entered.contains("exit") || entered.contains("Exit")){
                isDone = true;
                System.out.println("Goodbye!");
            }
            else{
                char option = entered.charAt(0);

                switch (option){
                    case '1':
                        System.out.println(enqueue(list));
                    case '2':
                        System.out.printf("Removed element is %s\n", dequeue(list));
                    case '3':
                        System.out.printf("First element is %s\n",first(list));
                    default:
                    System.out.println("Error, please enter correct option");
                }
            }
        }
    }
    public static LinkedList<String> enqueue(LinkedList<String> list){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter whatever you want to add: ");
        String entered = scanner.nextLine();

        list.add(entered);
        return list;
    }
    public static String dequeue(LinkedList<String> list){
        String temp = list.get(0);
        list.remove(0);
        System.out.println(list);
        return temp;
    }
    public static String first(LinkedList<String> list){
        return list.get(0);
    }
}