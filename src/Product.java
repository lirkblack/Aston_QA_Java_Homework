public class Product {

    // 1. Поля класса (описываем, из чего состоит товар)
    String name;           // название
    String productionDate; // дата производства
    String manufacturer;   // производитель
    String country;        // страна происхождения
    double price;          // цена
    boolean isBooked;      // состояние бронирования (true - забронирован, false - свободен)

    // 2. Конструктор (заполняет поля при создании объекта)
    public Product(String name, String productionDate, String manufacturer, String country, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    // 3. Метод, который выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
        System.out.println("-------------------------");
    }
}
