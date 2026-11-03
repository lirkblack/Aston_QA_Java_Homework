public class Dog extends Animal {

    // Конструктор класса Dog
    public Dog(String name) {
        super(name); // Вызываем конструктор родителя (Animal), чтобы задать имя
    }

    // метод "бежать" для собаки
    @Override
    public void run(int distance) {
        // По условию: собака может бежать максимум 500 м.
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 500 м.)");
        }
    }

    // метод "плыть" для собаки
    @Override
    public void swim(int distance) {
        // По условию: собака может плыть максимум 10 м.
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум 10 м.)");
        }
    }
}