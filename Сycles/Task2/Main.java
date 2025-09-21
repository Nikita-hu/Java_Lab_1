package Сycles.Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите значение X: ");
    int x = scanner.nextInt();
    Chet chet = new Chet();
    String res = chet.chet(x);
    System.out.println("Четная последовательность до X: " + res);
    }
}
