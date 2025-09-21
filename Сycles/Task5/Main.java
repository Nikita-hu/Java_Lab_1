package Сycles.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        RightTriangle rightTriangle = new RightTriangle();
        System.out.println("Правый треугольник: ");
        rightTriangle.rightTriangle(x);
    }
}
