package Array.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        int [] arr = {1,2,3,4,2,2,5};

        FindFirst findFirst = new FindFirst();
        int res = findFirst.findFirst(arr, x);
        if (res >= 0) {
            System.out.println("Вхождение числа: " + x + " в массив: " + java.util.Arrays.toString(arr) + ": " + res);
        }
        else {
            System.out.println("Код ошибки: " + res);
        }
        

    }
}
