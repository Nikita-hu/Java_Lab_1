package Сycles.Task5;

public class RightTriangle {
    public void rightTriangle (int x) {
        int c = 1;
        for (int i = 0; i < x; i++) {
            for (int q = 0; q < c; q++) {
                System.out.print("*");
            }
            System.out.println("\n");
            c = c + 1;
        }
    }
}
