public class Circle implements Shape {

    // Радиус круга
    private double radius;
    // Цвет заливки
    private String fillColor;
    // Цвет границы
    private String borderColor;

    // Конструктор
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Периметр круга: 2 * PI * R
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Площадь круга: PI * R^2
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Геттеры для цветов
    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}