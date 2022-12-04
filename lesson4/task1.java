package lesson4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> someList = new LinkedList<>();

        for(int i = 0; i < 11; i++){
            someList.add(i);
        }

        System.out.printf("Original LinkedList: %s\n", someList.toString());
        System.out.printf("Reversed LinkedList: %s\n",reverseList(someList).toString());
    }
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
    
        int temp;

        for(int i = 0; i < list.size()/2; i++){
            temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

        return list;
    }
}
