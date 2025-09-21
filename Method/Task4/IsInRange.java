package Method.Task4;

public class IsInRange {
    public boolean isInRange (int a, int b, int num) {

        if (a<b)
        {
            if ((a <= num) && (num <= b)) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((a >= num) && (num >= b)) {
                return true;
            } else {
                return false;
            }
        }

    }
}
