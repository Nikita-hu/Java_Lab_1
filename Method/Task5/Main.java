package Method.Task5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsEqual isEqual = new IsEqual();
        System.out.println("Введите первое число: ");
        int one = scanner.nextInt();        
        System.out.println("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int three = scanner.nextInt();
        boolean res = isEqual.isEqual(one, two, three);
        System.out.println("Вывод: " + res);

    }
}
