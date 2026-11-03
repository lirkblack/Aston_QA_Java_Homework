public class Bowl {

    // Количество еды в миске
    private int food;

    // Конструктор: при создании миски указываем, сколько в ней еды
    public Bowl(int food) {
        this.food = food;
    }

    // Метод, чтобы узнать, сколько еды осталось
    public int getFood() {
        return food;
    }

    // Метод, чтобы добавить еду в миску
    public void addFood(int amount) {
        food += amount;
        System.out.println("В миску добавили " + amount + " еды. Теперь в миске: " + food);
    }

    // Метод, чтобы уменьшить количество еды (когда кот ест)
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }
}