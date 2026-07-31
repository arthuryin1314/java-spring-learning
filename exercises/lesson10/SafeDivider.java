package lesson10;

public class SafeDivider {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        }catch (NumberFormatException num){
            System.out.println("输入的不是数字");
        }catch (ArithmeticException o){
            System.out.println("除数不能为0");
        }finally {
            System.out.print("计算结束");
        }
    }
}
