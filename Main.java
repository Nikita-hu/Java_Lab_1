import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("array \nmethod \ncycles \ncondition \nВыбери тему задачи: ");
        String theme = scanner.nextLine();
        switch (theme) {
            case "array":
                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String arrayTask = scanner.nextLine();
                switch (arrayTask) {
                    case "task1": {
                        System.out.println("Введите X: ");
                        int x = scanner.nextInt();
                        int[] arr = { 1, 2, 3, 4, 2, 2, 5 };
                        Tasks tasks = new Tasks();
                        int res = tasks.findFirst(arr, x);
                        if (res >= 0) {
                            System.out.println("Вхождение числа: " + x + " в массив: " + java.util.Arrays.toString(arr)
                                    + ": " + res);
                        } else {
                            System.out.println("Код ошибки: " + res);
                        }
                        break;
                    }
                    case "task2": {
                        int[] arr = { 1, -2, -7, 4, 2, 2, 5 };
                        Tasks tasks = new Tasks();
                        int res = tasks.maxAbs(arr);
                        System.out.println("Максимальное число по модулю: " + res);
                        break;
                    }
                    case "task3": {
                        System.out.println("Введите позицию X: ");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();
                        int[] arr = { 1, 2, 3, 4, 5 };
                        int[] ins = { 7, 8, 9 };

                        int[] res = tasks.add(arr, ins, x);
                        System.out.println("Полученный массив: " + java.util.Arrays.toString(res));
                        break;
                    }
                    case "task4": {
                        int[] arr = { 1, 2, 3, 4, 5 };
                        Tasks tasks = new Tasks();
                        int[] res = tasks.reverseBack(arr);
                        System.out.println("Массив наоборот: " + java.util.Arrays.toString(res));
                        break;
                    }
                    case "task5": {
                        System.out.println("Введите значение X: ");
                        int x = scanner.nextInt();
                        int[] arr = { 1, 2, 3, 8, 2, 2, 9 };
                        Tasks tasks = new Tasks();
                        int[] res = tasks.findAll(arr, x);
                        System.out.println("Вхождения числа " + x + ": " + java.util.Arrays.toString(res));
                        break;
                    }
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "method":

                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String methodTask = scanner.nextLine();
                switch (methodTask) {
                    case "task1": {
                        Tasks tasks = new Tasks();
                        System.out.println("введите значениеы: X");

                        double x = scanner.nextDouble();

                        double res = tasks.fraction(x);
                        System.out.println(res);
                        break;
                    }
                    case "task2": {
                        Tasks tasks = new Tasks();

                        System.out.println("Введите символ:");
                        char x = scanner.nextLine().charAt(0); // берем первый символ из строки

                        int res = tasks.charToNum(x);
                        System.out.println("Символ переведен в число, дорогой пользователь: " + res);

                        scanner.close();
                        break;
                    }
                    case "task3": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите значени х:");
                        int x = scanner.nextInt();
                        boolean res = tasks.is2Digits(x);
                        System.out.println("Число двузначное? " + res);
                        break;
                    }
                    case "task4": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите значение a: ");
                        int a = scanner.nextInt();
                        System.out.println("Введите значение b: ");
                        int b = scanner.nextInt();
                        System.out.println("Введите значение num: ");
                        int num = scanner.nextInt();
                        boolean res = tasks.isInRange(a, b, num);
                        System.out.println("Входит ли число в интервал от a до b? " + res);
                        break;
                    }
                    case "task5": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите первое число: ");
                        int one = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int two = scanner.nextInt();
                        System.out.println("Введите третье число: ");
                        int three = scanner.nextInt();
                        boolean res = tasks.isEqual(one, two, three);
                        System.out.println("Вывод: " + res);
                        break;
                    }
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "cycles":

                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String cyclesTask = scanner.nextLine();
                switch (cyclesTask) {
                    case "task1": {
                        System.out.println("Введите X: ");
                        Tasks tasks = new Tasks();
                        int x = scanner.nextInt();
                        String res = tasks.listNums(x);
                        System.out.println("Последовательность до X: " + res);
                        break;
                    }
                    case "task2": {

                        System.out.println("Введите значение X: ");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();
                        String res = tasks.chet(x);
                        System.out.println("Четная последовательность до X: " + res);
                        break;
                    }
                    case "task3": {
                        System.out.println("Введите X: ");
                        long x = scanner.nextLong();
                        Tasks tasks = new Tasks();
                        int res = tasks.numLen(x);
                        System.out.println("Длина строки: " + res);
                        break;
                    }
                    case "task4": {

                        System.out.println("Введите Х: ");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();
                        // int res = square.square(x);

                        System.out.println("Квадрат размером " + x + "х" + x + ": ");
                        tasks.square(x);
                        break;
                    }
                    case "task5": {
                        System.out.println("Введите X: ");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();
                        System.out.println("Правый треугольник: ");
                        tasks.rightTriangle(x);
                        break;
                    }
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "condition":

                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String conditionTask = scanner.nextLine();
                switch (conditionTask) {
                    case "task1": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите значение x:");
                        int x = scanner.nextInt();
                        int res = tasks.abs(x);
                        System.out.println("Вывод: " + res);
                        break;
                    }
                    case "task2": {
                        System.out.println("Введите значение x: ");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();
                        boolean res = tasks.is35(x);
                        System.out.println("Вывод: " + res);
                        break;
                    }
                    case "task3": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите значение х: ");
                        int x = scanner.nextInt();

                        System.out.println("Введите значение y: ");
                        int y = scanner.nextInt();

                        System.out.println("Введите значение z: ");
                        int z = scanner.nextInt();

                        int res = tasks.max3(x, y, z);
                        System.out.println("Максимальное число: " + res);
                        break;
                    }
                    case "task4": {
                        Tasks tasks = new Tasks();
                        System.out.println("Введите первое число: X");
                        int x = scanner.nextInt();
                        System.out.println("Введите первое число: Y");
                        int y = scanner.nextInt();

                        int result = tasks.sum2(x, y);
                        System.out.println("Ответ: " + result);
                        break;
                    }
                    case "task5": {
                        System.out.println("Введите число: X");
                        int x = scanner.nextInt();
                        Tasks tasks = new Tasks();

                        String res = tasks.day(x);
                        System.out.println("День недели: " + res);
                        break;
                    }
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            default:
                System.out.println("Нет такой темы!");
        }
        scanner.close();
    }
}
