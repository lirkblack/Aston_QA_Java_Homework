import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создаем телефонный справочник
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        System.out.println("=== Добавление записей ===");
        phoneBook.add("Иванов", "+7-900-111-22-33");
        phoneBook.add("Петров", "+7-900-444-55-66");
        phoneBook.add("Иванов", "+7-900-777-88-99"); // Второй номер для Иванова (однофамилец)
        phoneBook.add("Сидоров", "+7-900-000-11-22");

        // Ищем номера
        System.out.println("\n=== Поиск номеров ===");

        // Ищем Иванова (должно быть 2 номера)
        List<String> ivanovPhones = phoneBook.get("Иванов");
        System.out.println("Телефоны Иванова: " + ivanovPhones);

        // Ищем Петрова (должен быть 1 номер)
        List<String> petrovPhones = phoneBook.get("Петров");
        System.out.println("Телефоны Петрова: " + petrovPhones);

        // Ищем того, кого нет в справочнике
        List<String> smirnovPhones = phoneBook.get("Смирнов");
        System.out.println("Телефоны Смирнова: " + smirnovPhones);
    }
}