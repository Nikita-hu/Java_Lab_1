package Сycles.Task4;

public class Square {
    public void square (int x) {
        // StringBuilder sq = new StringBuilder();
        for (int i = 0; i < x; i++) {
            for (int q = 0; q < x; q++) {
                // sq.append(" * ");
                System.out.print("* ");
            }
            // sq.append("\n");
            System.out.println(" ");
           }

        // System.out.print(sq.toString());
    }
}
