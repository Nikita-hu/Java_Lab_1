package Сycles.Task2;

public class Chet {
    public String chet (int x) {
        String a [] = new String[(x / 2) + 1];
        int index = 0;
        for (int i = 0; i <= x; i+=2) {
            a[index] = String.valueOf(i);
            index++;
        }
        return String.join(" ", a);
    }
}
