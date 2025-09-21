package Condition.Task3;

public class Max3 {
    public int max3 (int x, int y, int z) {
        if ((x >= y) && (x >= z)) 
        {
            return x;
        }
         else if ((y >= x) && (y >= z)) 
        {
            return y;
        } else {
            return z;
        }
    }
}
