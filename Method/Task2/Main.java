package Method.Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharToNum CharToNum = new CharToNum();
        
        System.out.println("Введите символ:");
        char x = scanner.nextLine().charAt(0); // берем первый символ из строки
        
        int res = CharToNum.charToNum(x);
        System.out.println("Символ переведен в число, дорогой пользователь: " + res);
        
        scanner.close();
    }
}