package lesson03;

public class GradeChecker {
    public static void main(String[] args) {
        int score = 50;
        if(score>=90){
            System.out.println("优秀");
        } else if (score>=75) {
            System.out.println("良好");
        } else if (score>=60) {
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
