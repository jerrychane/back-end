import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.print("请输入用户初始分数: ");
        int score = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.println("加分前成绩：" + score);
        while(score<60) {
            score++;
            count++;
        }
        System.out.println("加分后成绩：" + score);
        System.out.println("一共加了" + count + "次！");
    }
}
