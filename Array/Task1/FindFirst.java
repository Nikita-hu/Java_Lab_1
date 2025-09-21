package Array.Task1;

public class FindFirst {
    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
           
        }
        return -1;
    }
}
