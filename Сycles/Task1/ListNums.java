package Сycles.Task1;

public class ListNums {
    public String listNums (int x) {
        String[] a = new String[x + 1];
        for (int i = 0; i < x; i++) {
            a[i] = String.valueOf(i);
        }
        return String.join(" ", a);
    }

}
