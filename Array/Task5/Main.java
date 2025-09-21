package Array.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение X: ");
        int x = scanner.nextInt();
        int[] arr = {1,2,3,8,2,2,9};
        FindAll findAll = new FindAll();
        int[] res = findAll.findAll(arr, x);
        System.out.println("Вхождения числа " + x + ": " + java.util.Arrays.toString(res));
    }
}
