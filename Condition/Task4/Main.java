package Condition.Task4;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Sum2 sum2 = new Sum2();
        System.out.println("Введите первое число: X");
        int x = scanner.nextInt();
        System.out.println("Введите первое число: Y");
        int y = scanner.nextInt();

        int result = sum2.sum2(x, y);
        System.out.println("Ответ: " + result);
    }
}
