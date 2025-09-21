package Method.Task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Is2Digits is2Digits = new Is2Digits();
        System.out.println("Введите значени х:" );
        int x = scanner.nextInt();
        boolean res = is2Digits.is2Digits(x);
        System.out.println("Число двузначное? " + res);

    }
}
