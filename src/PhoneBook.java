import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    // Хранилище: Ключ - Фамилия, Значение - Список номеров телефонов
    private Map<String, List<String>> book;

    // Конструктор
    public PhoneBook() {
        this.book = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String surname, String phone) {
        // Если фамилии еще нет в книге, создаем для нее новый пустой список
        if (!book.containsKey(surname)) {
            book.put(surname, new ArrayList<>());
        }
        // Добавляем номер в список к этой фамилии
        book.get(surname).add(phone);
        System.out.println("Добавлен номер " + phone + " для " + surname);
    }

    // Метод для поиска номеров по фамилии
    public List<String> get(String surname) {
        // Возвращаем список номеров, если фамилия найдена, иначе null
        return book.get(surname);
    }
}