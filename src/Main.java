public class Main {
    public static void main(String[] args) {

        // Создаем круг:
        Circle circle = new Circle(5, "Красный", "Черный");
        circle.printInfo();

        // Создаем прямоугольник:
        Rectangle rectangle = new Rectangle(4, 6, "Синий", "Белый");
        rectangle.printInfo();

        // Создаем треугольник:
        Triangle triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");
        triangle.printInfo();
    }
}