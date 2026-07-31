package lesson06;

import java.util.ArrayList;
import java.util.List;

public class CourseRoster {
    public static void main(String[] args) {
        List<String> students=new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add(0,"Mike");

        students.remove("Bob");
        for(String student:students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
