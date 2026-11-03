public class Park {

    // Внутренний класс Attraction (Аттракцион)
    class Attraction {
        String name;        // Название аттракциона
        String workingTime; // Время работы (например, "10:00 - 20:00")
        double price;       // Стоимость

        // Конструктор внутреннего класса
        public Attraction(String name, String workingTime, double price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingTime);
            System.out.println("Стоимость: " + price);
            System.out.println("-------------------------");
        }
    }
}