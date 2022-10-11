public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        // Homework 8 Task 1
        System.out.println("Homework 8 Task 1");
        // Объявите три массива:
        // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив
        // его значениями.
        // 3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите
        // способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        System.out.println();
    }

    public static void task2() {
        // Homework 8 Task 2
        System.out.println("Homework 8 Task 2");
        // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        // начиная с первого элемента, через запятую. Запятая между последним элементом одного массива
        // и первым элементом следующего не нужна.

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        // Homework 8 Task 3
        System.out.println("Homework 8 Task 3");
        // Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать
        // нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны
        // через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }

        double[] arr3 = {72.523, 68.4, 57.9, 80.12};
        for (int i = 3; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }
        System.out.println();
    }

    public static void task4() {
        // Homework 8 Task 4
        System.out.println("Homework 8 Task 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        // (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения
        // задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.

        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (arr1[i] % 2 == 1) {
                arr1[i] += 1;
            } else {
                arr1[i] = arr1[i];
            }
            if (i < 2) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.println(arr1[i]);
            }
        }
    }
}