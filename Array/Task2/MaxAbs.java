package Array.Task2;

public class MaxAbs {
    public int maxAbs (int[] arr) {
        int origMaxabs = arr[0];
        int maxabs = Math.abs(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int currentabc = Math.abs(arr[i]);
            if ((currentabc) >= (maxabs)) {
                origMaxabs = arr[i];
            }
        }
        return origMaxabs;
    }
}
