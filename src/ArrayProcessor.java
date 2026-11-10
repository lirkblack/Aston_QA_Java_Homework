public class ArrayProcessor {

    // Метод, который принимает двумерный массив строк
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        // 1. ПРОВЕРКА РАЗМЕРА МАССИВА
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива. Ожидается 4x4, а получено строк: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива. Ожидается 4x4, а в строке " + i + " столбцов: " + array[i].length);
            }
        }

        // 2. СУММИРОВАНИЕ ЭЛЕМЕНТОВ
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String cell = array[i][j];

                try {
                    int number = Integer.parseInt(cell);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + cell);
                }
            }
        }

        return sum;
    }
}