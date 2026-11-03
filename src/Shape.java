public interface Shape {
    // Методы, которые обязаны реализовать все фигуры
    double getPerimeter(); // Периметр
    double getArea();      // Площадь
    String getFillColor(); // Цвет заливки
    String getBorderColor(); // Цвет границы

    // Дефолтный метод (реализация по умолчанию) для вывода информации
    default void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("-------------------------");
    }
}