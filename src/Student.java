import java.util.Arrays;

public class Student {
    // Поля класса
    private String name;
    private String group;
    private int course;
    private int[] grades; // Оценки по предметам

    // Конструктор
    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // Метод для вычисления среднего балла
    public double getAverageGrade() {
        if (grades.length == 0) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Геттеры и сеттеры
    public String getName() { return name; }
    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    // Переопределяем toString, чтобы при печати студента выводилось его имя
    @Override
    public String toString() {
        return "Студент: " + name + " (Курс: " + course + ", Средний балл: " + getAverageGrade() + ")";
    }
}