package Сycles.Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        ListNums listNums = new ListNums();
        int x = scanner.nextInt();
        String res = listNums.listNums(x);
        System.out.println("Последовательность до X: " + res); 
    }
}
