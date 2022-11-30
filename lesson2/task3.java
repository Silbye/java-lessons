package lesson2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.lang.StringBuilder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class task3 {
    public static void main(String[] args){
        
        JSONParser parser = new JSONParser();
            
        try(FileReader reader = new FileReader("lesson2/students.json")){
            Object obj = parser.parse(reader);
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);

            studentList.forEach(student -> parseStudent((JSONObject)student));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
    private static void parseStudent(JSONObject student){
        StringBuilder sb = new StringBuilder();

        String surname = (String) student.get("surname");
        String grade = (String) student.get("grade");
        String subject = (String) student.get("subject");

        sb.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject);
        System.out.println(sb);
    }
}
    
