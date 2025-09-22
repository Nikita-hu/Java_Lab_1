import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("array \nmethod \ncycles \ncondition \nВыбери тему задачи: ");
        String theme = scanner.nextLine();
        switch (theme) {
            case "array":
                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String ArrayTasks = scanner.nextLine();
                switch (ArrayTasks) {
                    case "task1":
                        Tasks.arrayTask1();
                        break;
                    case "task2":
                        Tasks.arrayTask2();
                        break;
                    case "task3":
                        Tasks.arrayTask3();
                        break;
                    case "task4":
                        Tasks.arrayTask4();
                        break;
                    case "task5":
                        Tasks.arrayTask5();
                        break;
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "method":
                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String MethodTasks = scanner.nextLine();
                switch (MethodTasks) {
                    case "task1":
                        Tasks.methodTask1();
                        break;
                    case "task2":
                        Tasks.methodTask2();
                        break;
                    case "task3":
                        Tasks.methodTask3();
                        break;
                    case "task4":
                        Tasks.methodTask4();
                        break;
                    case "task5":
                        Tasks.methodTask5();
                        break;
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "cycles":
                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String CyclesTasks = scanner.nextLine();
                switch (CyclesTasks) {
                    case "task1":
                        Tasks.cyclesTask1();
                        break;
                    case "task2":
                        Tasks.cyclesTask2();
                        break;
                    case "task3":
                        Tasks.cyclesTask3();
                        break;
                    case "task4":
                        Tasks.cyclesTask4();
                        break;
                    case "task5":
                        Tasks.cyclesTask5();
                        break;
                    default:
                        System.out.println("Нет такой задачи!");
                }
                break;

            case "condition":
                System.out.println("Выбери номер задачи: (task1, task2, task3, task4, task5)");
                String ConditionTasks = scanner.nextLine();
                switch (ConditionTasks) {
                    case "task1":
                        Tasks.conditionTask1();
                        break;
                    case "task2":
                        Tasks.conditionTask2();
                        break;
                    case "task3":
                        Tasks.conditionTask3();
                        break;
                    case "task4":
                        Tasks.conditionTask4();
                        break;
                    case "task5":
                        Tasks.conditionTask5();
                        break;
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
