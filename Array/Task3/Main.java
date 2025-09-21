package Array.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию X: ");
        int x = scanner.nextInt();
        AddArr addArr = new AddArr();
        int [] arr = {1, 2, 3, 4, 5};
        int [] ins = {7, 8, 9};

        int [] res = addArr.add(arr, ins, x);
        System.out.println("Полученный массив: " + java.util.Arrays.toString(res));

    }
}
