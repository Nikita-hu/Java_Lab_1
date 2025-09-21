package Condition.Task1;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Abs abc = new Abs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x:" );
        int x = scanner.nextInt();
        int res = abc.abs(x);
        System.out.println("Вывод: " + res);
    }
}
