public class Main {

    // --- ЧАСТЬ 2: Массив из 5 товаров ---
    public static void printAllProducts() {
        // 1. Массив объектов на 5 ячеек
        Product[] productsArray = new Product[5];

        // 2. Создаем 5 товаров и кладем их в массив
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "15.09.2024", "Apple Inc.", "USA", 4999, false);
        productsArray[2] = new Product("Xiaomi 14", "10.01.2024", "Xiaomi", "China", 2999, true);
        productsArray[3] = new Product("Google Pixel 8", "05.10.2023", "Google", "USA", 3499, false);
        productsArray[4] = new Product("OnePlus 12", "20.03.2024", "OnePlus", "China", 3999, true);

        // 3. Информация о каждом товаре
        System.out.println("=== Список товаров ===");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
    }

    // --- ЧАСТЬ 3: Парк
    public static void printParkAttractions() {
        // 1. Создаем объект парка
        Park park = new Park();

        // 2. Создаем аттракционы
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 21:00", 800);
        Park.Attraction attraction3 = park.new Attraction("Комната страха", "12:00 - 23:00", 600);

        // 3. Выводим информацию
        System.out.println("=== Аттракционы парка ===");
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }

    public static void main(String[] args) {
        // Вызов метода для задания 2 (Товары)
        printAllProducts();

        // Вызов метода для задания 3(Парк)
        printParkAttractions();
    }
}