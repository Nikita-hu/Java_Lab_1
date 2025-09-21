package Сycles.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Х: ");
        int x = scanner.nextInt();
        Square square = new Square();
        // int res = square.square(x);

        System.out.println("Квадрат размером " + x + "х" + x + ": ");
        square.square(x);
    }
}
