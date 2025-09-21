package Array.Task2;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,-2,-7,4,2,2,5};
        MaxAbs maxAbs = new MaxAbs();
        int res = maxAbs.maxAbs(arr);
        System.out.println("Максимальное число по модулю: " + res);
    }
}
