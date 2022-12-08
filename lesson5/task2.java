package lesson5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class task2{
    public static void main(String[] args){
        HashMap<Integer, String> employees = new HashMap<>();
        String employeesList = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
        "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
        "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] employeesArray = employeesList.split(", ");

        for(int i = 0; i < employeesArray.length; i++){
            employees.put(i, employeesArray[i]);
        }

        System.out.println(employees);

        String[] names = new String[employeesArray.length];

        for (int i = 0; i < employeesArray.length; i++){
            String[] nameArray = new String[2];
            nameArray = employees.get(i).split(" ");
            names[i] = nameArray[0];
        }

        Arrays.stream(names)
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach(System.out::println);
    }
}