public class Main {
    public static void main(String[] args) {


        // ЗАДАНИЕ 1: Наследование (Собака и Кот)
        System.out.println("=== ЗАДАНИЕ 1: Наследование ===");

        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        dogBobik.run(150);
        dogBobik.run(600);
        dogBobik.swim(5);
        dogBobik.swim(20);

        catMurzik.run(150);
        catMurzik.run(300);
        catMurzik.swim(5);

        System.out.println("Всего создано животных: " + Animal.count);
        System.out.println();


        // ЗАДАНИЕ 1 (продолжение): Миска и еда

        System.out.println("=== ЗАДАНИЕ 1: Миска с едой ===");

        // Создаем миску с 20 единицами еды
        Bowl bowl = new Bowl(20);

        // Создаем массив котов
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Рыжик");

        // Кормим котов
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
        }

        // Выводим сытость
        System.out.println("\n--- Сытость котов ---");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name + " сыт: " + cats[i].isSatiety());
        }

        // Добавляем еду в миску
        System.out.println("\n--- Добавление еды ---");
        bowl.addFood(30);
        System.out.println();
    }
}