package Condition.Task5;

import java.util.Scanner;

import Condition.Task5.DayW;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: X");
        int x = scanner.nextInt();
        DayW dayW = new DayW();

        String res = dayW.day(x);
        System.out.println("День недели: " + res);
    }

}
