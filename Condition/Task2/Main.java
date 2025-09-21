package Condition.Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        Is35 is35 = new Is35();
        boolean res = is35.is35(x);
        System.out.println("Вывод: " + res);
    }
}
