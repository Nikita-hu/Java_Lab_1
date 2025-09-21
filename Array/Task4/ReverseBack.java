package Array.Task4;

public class ReverseBack {
    public int[] reverseBack (int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }
        return res;
    }
}
