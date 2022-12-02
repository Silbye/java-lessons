package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        String genre1 = "Фантастика";
        String genre2 = "Детектив";
        String genre3 = "Классика";
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(3);

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList());
        }

        list.get(0).add(genre1);
        list.get(1).add(genre2);
        list.get(2).add(genre3);

        printList(fillList(list));
        
    }
    public static ArrayList<ArrayList<String>> fillList(ArrayList<ArrayList<String>> list){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Доступные жанры: %s, %s, %s\n", list.get(0).get(0), list.get(1).get(0), list.get(2).get(0));
        for(int i = 0; i < list.size(); i++){
            boolean isDone = false;
            int j = 1;
            while(isDone == false){
                System.out.printf("Введите автора и название книги для жанра %s: ", list.get(i).get(0));
                String entered = scanner.next();
                if(entered.contains("done") || entered.contains("Done")){
                    System.out.println("Done is written");
                    isDone = true;
                    continue;
                }
                else{
                    list.get(i).add(j, entered);
                    j++; 
                }
            }
        }
        return list;
    }
    public static void printList(ArrayList<ArrayList<String>> list){
        System.out.println(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(String.join("   ",list.get(i)));
        }
    }
}