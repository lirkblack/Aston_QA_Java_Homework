public class Main {

    // --- ЗАДАНИЕ 1 ---
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // --- ЗАДАНИЕ 2 ---
    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // --- ЗАДАНИЕ 3 ---
    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // --- ЗАДАНИЕ 4 ---
    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // --- ЗАДАНИЕ 5 ---
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    // --- ЗАДАНИЕ 6 ---
    public static void checkPositiveNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " положительное");
        } else {
            System.out.println("Число " + number + " отрицательное");
        }
    }

    // --- ЗАДАНИЕ 7 ---
    public static boolean checkNumber(int number) {

        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    // --- ЗАДАНИЕ 8 ---
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // --- ЗАДАНИЕ 9 ---
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // --- ЗАДАНИЕ 10 ---
    public static void invertArray() {
        // 1. Создаем массив из 0 и 1
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        // 2. Проходим циклом по всему массиву
        for (int i = 0; i < array.length; i++) {
            // 3. Проверяем: если элемент равен 0, меняем на 1, иначе (если 1) - меняем на 0
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        // 4. Выводим результат в консоль, чтобы проверить
        System.out.print("Результат замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переход на новую строку после вывода
    }

    // --- ЗАДАНИЕ 11 ---
    public static void fillArrayFrom1To100() {
        // 1. Создаем пустой массив длиной 100
        int[] array = new int[100];

        // 2. Заполняем масив с помощью цикла
        for (int i = 0; i < array.length; i++) {
            // Индекс i начинается с 0, но нам нужно положить числа от 1 до 100.
            // Поэтому мы кладем (i + 1).
            array[i] = i + 1;
        }

        // 3. Выводим результат в консоль для проверки
        System.out.println("Массив заполнен числами от 1 до 100:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переход на новую строку
    }

    // --- ЗАДАНИЕ 12 ---
    public static void multiplySmallNumbers() {
        // 1. Задаем массив
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // 2. Проходим по нему циклом
        for (int i = 0; i < array.length; i++) {
            // 3. Если элемент меньше 6, умножаем его на 2
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        // 4. Выводим результат для проверки
        System.out.println("Массив после умножения чисел < 6 на 2:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переход на новую строку
    }
    // --- ЗАДАНИЕ 13 ---
    public static void fillDiagonal() {
        // 1. Создаем квадратный двумерный массив (например, 5 на 5)
        int size = 5;
        int[][] matrix = new int[size][size];

        // 2. Заполняем диагональ единицами с помощью цикла
        for (int i = 0; i < size; i++) {
            // Так как массив квадратный, индекс строки (i) равен индексу столбца (i)
            matrix[i][i] = 1;
        }

        // 3. Выводим матрицу на экран для проверки
        System.out.println("Матрица с заполненной диагональю:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки матрицы
        }
    }
    // --- ЗАДАНИЕ 14 ---
    public static int[] createArray(int len, int initialValue) {
        // 1. Создаем массив нужной длины
        int[] array = new int[len];

        // 2. Заполняем каждую ячейку значением initialValue
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        // 3. Возвращаем готовый массив
        return array;
    }
    public static void main(String[] args) {

        // --- Проверка Задания 1 ---
        printThreeWords();

        // --- Проверка Задания 2 ---
        checkSumSign();

        // --- Проверка Задания 3 ---
        printColor();

        // --- Проверка Задания 4 ---
        compareNumbers();

        // --- Проверка Задания 5 ---
        boolean result1 = isSumInRange(10, 5);
        System.out.println("Сумма 10 и 5 в диапазоне 10-20? " + result1);

        boolean result2 = isSumInRange(5, 2);
        System.out.println("Сумма 5 и 2 в диапазоне 10-20? " + result2);

        // --- Проверка Задания 6 ---
        checkPositiveNumber(5);
        checkPositiveNumber(-3);
        checkPositiveNumber(0);

        // --- Проверка Задания 7 ---
        System.out.println("Число -5 отрицательное? " + checkNumber(-5)); // true
        System.out.println("Число 10 отрицательное? " + checkNumber(10)); // false
        System.out.println("Число 0 отрицательное? " + checkNumber(0));   // false

        // --- Проверка Задания 8 ---
        printStringMultipleTimes("Привет!", 3); // Напечатает "Привет!" 3 раза

        // --- Проверка Задания 9 ---
        System.out.println("2024 год високосный? " + isLeapYear(2024)); // true (делится на 4, не делится на 100)
        System.out.println("2023 год високосный? " + isLeapYear(2023)); // false (не делится на 4)
        System.out.println("1900 год високосный? " + isLeapYear(1900)); // false (делится на 100, но не на 400)
        System.out.println("2000 год високосный? " + isLeapYear(2000)); // true (делится на 400)

        // --- Проверка Задания 10 ---
        invertArray();

        // --- Проверка Задания 11 ---
        fillArrayFrom1To100();

        // --- Проверка Задания 12 ---
        multiplySmallNumbers();

        // --- Проверка Задания 13 ---
        fillDiagonal();

        // --- Проверка Задания 14 ---
        System.out.println("Массив из задания 14:");

        // Вызываем метод: создаем массив длиной 5, заполненный числом 7
        int[] myArray = createArray(5, 7);

        // Выводим его на экран
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); // Переход на новую строку
    }


}
