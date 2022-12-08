package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class task1 {
    public static void main(String[] args){
        Map<Long, String> PhoneList = new HashMap<Long, String>();
        menu(PhoneList);
    }
    public static void menu(Map<Long, String> list){
        Scanner scanner = new Scanner(System.in);
        boolean isDone = false;

        while(isDone != true){
            System.out.print("Select option - Add, Print, Exit: ");
            String option = scanner.next();
            if(option.contains("add") || option.contains("Add")){
                addToPhoneList(list);
            }
            else if(option.contains("print") || option.contains("Print")){
                printPhoneList(list);
            }
            else if(option.contains("exit") || option.contains("Exit")){
                System.out.println("Goodbye!");
                isDone = true;
            }
            else{
                System.out.println("Error, incorrect input!");
            }
        }
    }
    public static Map<Long, String> addToPhoneList(Map<Long, String> list){
        boolean isDone = false;
        boolean numberEntered = false;
        boolean personEntered = false;

        Scanner scanner = new Scanner(System.in);
        while(isDone != true){
            long phoneNumber = 0;
            while(numberEntered != true){
                System.out.print("Enter phone number (as Integer): ");
                String entered = scanner.nextLine();
                try{
                    phoneNumber = Long.parseLong(entered);
                    numberEntered = true;
                }
                catch(Exception e){
                    System.out.println("Error, please enter a phone number as Integer");
                }
            }
            while(personEntered != true){
                System.out.print("Enter person phone number belongs to: ");
                String entered = scanner.nextLine();
                try{
                    list.put(phoneNumber, entered);
                    personEntered = true;
                    isDone = true;
                }
                catch(Exception e){
                }
            }
        }
        return list;
    }
    public static void printPhoneList(Map<Long, String> list){
        Set<Entry<Long, String>> set = list.entrySet();
        for (Entry<Long, String> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
