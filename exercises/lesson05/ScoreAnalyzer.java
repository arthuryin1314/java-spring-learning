package lesson05;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {85, 92, 47, 63, 78, 90, 55};

        System.out.println("第一小问------");
        System.out.println(scores.length);
        System.out.println("-----");
        System.out.println("第二小问------");
        int totalScore = 0;
        for(int score:scores){
            totalScore+=score;
        }
        System.out.println(totalScore/scores.length);
        System.out.println("-----");
        System.out.println("第三小问------");
        for(int score:scores){
            if(score>=60){
                System.out.println(score);
            }
        }
        System.out.println("-----");
    }
}
