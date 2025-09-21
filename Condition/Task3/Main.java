package Condition.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Max3 max3 = new Max3();
        System.out.println("Введите значение х: ");
        int x = scanner.nextInt();

        System.out.println("Введите значение y: ");
        int y = scanner.nextInt();

        System.out.println("Введите значение z: ");
        int z = scanner.nextInt();

        int res = max3.max3(x, y, z);
        System.out.println("Максимальное число: " + res);
    }
}
