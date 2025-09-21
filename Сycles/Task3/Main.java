package Сycles.Task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        long x = scanner.nextLong();
        NumLen numLen = new NumLen();
        int res = numLen.numLen(x);
        System.out.println("Длина строки: " + res);
    }
}
