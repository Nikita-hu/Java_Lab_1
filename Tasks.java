import java.util.Scanner;

public class Tasks {
    public static void methodTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите значение: X");
        double x = scanner.nextDouble();
        double res = x - (int)x;
        System.out.println(res);
        scanner.close();
    }

    public static void methodTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ:");
        char x = scanner.nextLine().charAt(0);
        int res = (int)x;
        System.out.println("Символ переведен в число: " + res);
        scanner.close();
    }

    public static void methodTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x:");
        int x = scanner.nextInt();
        boolean res = (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
        System.out.println("Число двузначное? " + res);
        scanner.close();
    }

    public static void methodTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        System.out.println("Введите значение num: ");
        int num = scanner.nextInt();
        boolean res = num >= a && num <= b;
        System.out.println("Входит ли число в интервал от a до b? " + res);
        scanner.close();
    }

    public static void methodTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int two = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int three = scanner.nextInt();
        boolean res = (one == two) && (two == three);
        System.out.println("Вывод: " + res);
        scanner.close();
    }

    public static void cyclesTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            res.append(i).append(" ");
        }
        System.out.println("Последовательность до X: " + res.toString().trim());
        scanner.close();
    }

    public static void cyclesTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение X: ");
        int x = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        for (int i = 2; i <= x; i += 2) {
            res.append(i).append(" ");
        }
        System.out.println("Четная последовательность до X: " + res.toString().trim());
        scanner.close();
    }

    public static void cyclesTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        long x = scanner.nextLong();
        int res = String.valueOf(x).length();
        System.out.println("Длина строки: " + res);
        scanner.close();
    }

    public static void cyclesTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        System.out.println("Квадрат размером " + x + "x" + x + ": ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void cyclesTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        System.out.println("Правый треугольник: ");
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static void arrayTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X: ");
        int x = scanner.nextInt();
        int[] arr = {1,2,3,4,2,2,5};
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res = i;
                break;
            }
        }
        if (res >= 0) {
            System.out.println("Вхождение числа: " + x + " в массив: " + java.util.Arrays.toString(arr) + ": " + res);
        } else {
            System.out.println("Код ошибки: " + res);
        }
        scanner.close();
    }

    public static void arrayTask2() {
        int[] arr = {1,-2,-7,4,2,2,5};
        int maxAbs = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxAbs) {
                maxAbs = Math.abs(arr[i]);
            }
        }
        System.out.println("Максимальное число по модулю: " + maxAbs);
    }

    public static void arrayTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите позицию X: ");
        int x = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < x; i++) res[i] = arr[i];
        for (int i = 0; i < ins.length; i++) res[x + i] = ins[i];
        for (int i = x; i < arr.length; i++) res[i + ins.length] = arr[i];
        System.out.println("Полученный массив: " + java.util.Arrays.toString(res));
        scanner.close();
    }

    public static void arrayTask4() {
        int[] arr = {1,2,3,4,5};
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) res[i] = arr[arr.length - 1 - i];
        System.out.println("Массив наоборот: " + java.util.Arrays.toString(res));
    }

    public static void arrayTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение X: ");
        int x = scanner.nextInt();
        int[] arr = {1,2,3,8,2,2,9};
        int[] temp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) temp[count++] = i;
        }
        int[] res = new int[count];
        System.arraycopy(temp, 0, res, 0, count);
        System.out.println("Вхождения числа " + x + ": " + java.util.Arrays.toString(res));
        scanner.close();
    }

    public static void conditionTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x:");
        int x = scanner.nextInt();
        int res = Math.abs(x);
        System.out.println("Вывод: " + res);
        scanner.close();
    }

    public static void conditionTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        boolean res = (x % 3 == 0) || (x % 5 == 0);
        System.out.println("Вывод: " + res);
        scanner.close();
    }

    public static void conditionTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();
        System.out.println("Введите значение y: ");
        int y = scanner.nextInt();
        System.out.println("Введите значение z: ");
        int z = scanner.nextInt();
        int res = Math.max(x, Math.max(y, z));
        System.out.println("Максимальное число: " + res);
        scanner.close();
    }

    public static void conditionTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: X");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: Y");
        int y = scanner.nextInt();
        int result = x + y;
        System.out.println("Ответ: " + result);
        scanner.close();
    }

    public static void conditionTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: X");
        int x = scanner.nextInt();
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        String res = (x >= 1 && x <= 7) ? days[x - 1] : "Нет такого дня";
        System.out.println("День недели: " + res);
        scanner.close();
    }
}
