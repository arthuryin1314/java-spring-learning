package lesson07;

import java.util.ArrayList;
import java.util.List;


public class ScoreSheet {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(null);
        int total = 0;
        for(int i=0;i<scores.size();i++){
            total += scores.get(i);//因为scores.get(3)是null，所以会拆箱报空指针异常
        }
        double avg_score = (double)total/scores.size();
        System.out.println("Average score: " + avg_score);
    }
}
