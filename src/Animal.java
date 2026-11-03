public abstract class Animal {

    // Имя животного
    protected String name;

    // Статический счетчик для подсчета всех созданных животных
    protected static int count = 0;

    // Конструктор базового класса
    public Animal(String name) {
        this.name = name;
        count++; // При создании каждого животного увеличиваем счетчик
    }

    // метод "бежать".
    public abstract void run(int distance);

    // метод "плыть".
    public abstract void swim(int distance);
}