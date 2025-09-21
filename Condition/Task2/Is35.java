package Condition.Task2;

public class Is35 {
    public boolean is35 (int x) {
        if (((x % 5) == 0 ) && ((x % 3) == 0)) 
        {
            return false;
        } else if (((x % 5) == 0) || (x % 3) == 0) {
            return true;
        }
        else {
            return false;
        }
       
    }
}
