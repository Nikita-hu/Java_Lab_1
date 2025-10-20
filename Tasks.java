import java.util.Scanner;

public class Tasks {

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }

        }
        return -1;
    }

    public int maxAbs(int[] arr) {
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

    public int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[arr.length - 1 - i] = arr[i];
        }
        return res;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[index] = i;
                index++;
            }
        }
        return res;

    }

    public double fraction(double x) {
        double y = x - Math.floor(x);
        return y;
    }

    public int charToNum(char x) {
        char zero = '0';
        int res = x - zero;
        return res;
    }

    public boolean is2Digits(int x) {
        if ((x >= 10) && (x <= 99)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isInRange(int a, int b, int num) {

        if (a < b) {
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

    public boolean isEqual(int a, int b, int c) {
        if ((a == b) && (b == c) && (a == c)) {
            return true;
        } else {
            return false;
        }
    }

    public String listNums(int x) {
        String[] a = new String[x + 1];
        for (int i = 0; i <= x; i++) {
            a[i] = String.valueOf(i);
        }
        return String.join(" ", a);
    }

    public String chet(int x) {
        String a[] = new String[(x / 2) + 1];
        int index = 0;
        for (int i = 0; i <= x; i += 2) {
            a[index] = String.valueOf(i);
            index++;
        }
        return String.join(" ", a);
    }

    public int numLen(long x) {
        String a = String.valueOf(x);
        int len = a.length();
        return len;

    }

    public void square(int x) {
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

    public void rightTriangle(int x) {
        int c = 1;
        for (int i = 0; i < x; i++) {
            for (int q = 0; q < c; q++) {
                System.out.print("*");
            }
            System.out.println("\n");
            c = c + 1;
        }
    }

    public int abs(int x) {
        return Math.abs(x);
    }

    public boolean is35(int x) {
        if (((x % 5) == 0) && ((x % 3) == 0)) {
            return false;
        } else if (((x % 5) == 0) || (x % 3) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int max3(int x, int y, int z) {
        if ((x >= y) && (x >= z)) {
            return x;
        } else if ((y >= x) && (y >= z)) {
            return y;
        } else {
            return z;
        }
    }

    public int sum2(int x, int y) {
        int res = x + y;
        if ((10 <= res) && (res <= 19)) {
            return 20;
        } else {
            return res;
        }
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Ошибка, введите значение от 1 до 7";
        }
    }
}
