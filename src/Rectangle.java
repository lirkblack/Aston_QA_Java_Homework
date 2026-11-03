public class Rectangle implements Shape {

    // Ширина и высота прямоугольника
    private double width;
    private double height;
    // Цвета
    private String fillColor;
    private String borderColor;

    // Конструктор
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Периметр прямоугольника: 2 * (ширина + высота)
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Площадь прямоугольника: ширина * высота
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}