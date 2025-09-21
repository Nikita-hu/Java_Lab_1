package Array.Task4;

public class Main {
    public static void main(String [] args) {

        int[] arr = {1,2,3,4,5};
        ReverseBack reverseBack = new ReverseBack();
        int[] res = reverseBack.reverseBack(arr);
        System.out.println("Массив наоборот: " + java.util.Arrays.toString(res));
    }
}
