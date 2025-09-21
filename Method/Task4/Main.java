package Method.Task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsInRange isInRange = new IsInRange();
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.println("Введите значение num: ");
        int num = scanner.nextInt();
        boolean res = isInRange.isInRange(a, b, num);
        System.out.println("Входит ли число в интервал от a до b? " + res);
    }
}
