package lesson08;

public class StringWorkshop {
    public static void main(String[] args) {
        String email = " User@Example.COM ";
        String trim_email;
        trim_email=email.trim().toLowerCase();
        if(trim_email.contains("@")){
            System.out.println("合法邮箱");
        }else{
            System.out.println("非法邮箱");
        }
        System.out.println(trim_email.indexOf("@"));
        System.out.println(trim_email.substring(0,trim_email.indexOf("@")));
    }
}
