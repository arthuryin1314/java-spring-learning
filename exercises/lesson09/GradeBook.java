package lesson09;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 90);
        grades.put("Bob", 85);
        grades.put("Charlie", 92);
        grades.put("Alice",100);
        System.out.println(grades.containsKey("Jack"));
        for(Map.Entry<String,Integer> grade:grades.entrySet()){
            System.out.println("学生" + grade.getKey() + "成绩是" + grade.getValue());
        }
        System.out.println(grades.getOrDefault("David", 0));
    }
}
