package lesson2;

import java.lang.StringBuilder;

public class task1 {
    public static void main(String[] args){
        String sql = "select * from students where ";
        
        String[] json = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};

        String tempString;
        String[] tempArray = new String[2];

        StringBuilder sb = new StringBuilder(sql);
        
        for(int i = 0; i < json.length; i++){

            tempString = json[i];

            tempArray = tempString.split(":");
            if(tempString.contains("null")){
                continue;
            }
            else{
                System.out.printf("%s %s \n", tempArray[0], tempArray[1]);
                sb.append(tempArray[0]).append(":").append(tempArray[1]).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
