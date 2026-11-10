public class Main {
    public static void main(String[] args) {

        // ТЕСТ 1: Правильный массив 4x4
        System.out.println("=== ТЕСТ 1: Правильный массив 4x4 ===");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(correctArray);
            System.out.println("Сумма всех элементов: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // ТЕСТ 2: Неправильный размер (3x3)
        System.out.println("\n=== ТЕСТ 2: Неправильный размер (3x3) ===");
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int result = ArrayProcessor.processArray(wrongSizeArray);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        // ТЕСТ 3: Ошибка в данных (текст вместо числа)
        System.out.println("\n=== ТЕСТ 3: Ошибка в данных ===");
        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "abc", "11", "12"}, // Ошибка тут (текст вместо числа)
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(wrongDataArray);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }


        // ТЕСТ 4: ArrayIndexOutOfBoundsException
        System.out.println("\n=== ТЕСТ 4: Выход за границы массива ===");
        try {
            int[] arr = new int[3]; // Массив на 3 элемента (индексы 0, 1, 2)
            arr[5] = 10; // Пытаемся обратиться к 6-му элементу (индекс 5)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение выхода за границы: " + e.getMessage());
        }
    }
}