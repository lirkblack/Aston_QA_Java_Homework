public class Cat extends Animal {

    // Сытость: true - сыт, false - голоден
    private boolean satiety;

    // Конструктор: при создании кот голоден
    public Cat(String name) {
        super(name);
        this.satiety = false;
    }

    // Реализация метода "бежать" для кота
    @Override
    public void run(int distance) {
        // По условию: кот может бежать максимум 200 м.
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум 200 м.)");
        }
    }

    // Реализация метода "плыть" для кота
    @Override
    public void swim(int distance) {
        // По условию: кот не умеет плавать
        System.out.println(name + " не умеет плавать.");
    }

    // Метод: кот ест из миски
    public void eat(Bowl bowl) {
        // Проверяем, достаточно ли еды в миске (нужно 10 единиц)
        if (bowl.getFood() >= 10) {
            bowl.decreaseFood(10); // Уменьшаем еду в миске
            this.satiety = true;   // Кот становится сытым
            System.out.println(name + " поел и теперь сыт.");
        } else {
            // Если еды мало, кот не трогает миску
            System.out.println(name + " не стал есть, в миске слишком мало еды.");
        }
    }

    // Метод, чтобы узнать, сыт ли кот
    public boolean isSatiety() {
        return satiety;
    }
}