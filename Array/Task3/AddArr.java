package Array.Task3;

public class AddArr {
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] resEnd = new int[arr.length + ins.length];
        int index = 0;

        for (int i = 0; i < pos; i++) {
            resEnd[index] = arr[i];
            index++;
        }
        for (int i = 0; i < ins.length; i++) {
            resEnd[index] = ins[i];
            index++;
        }
        for (int i = pos; i < arr.length; i++) {
            resEnd[index] = arr[i];
            index++;
        }
        
        return resEnd;
    }
}
