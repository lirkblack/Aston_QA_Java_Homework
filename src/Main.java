import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию студентов (Set - чтобы не было дублей)
        Set<Student> students = new HashSet<>();

        // Добавляем студентов (имя, группа, курс, оценки)
        students.add(new Student("Иван", "A-1", 1, new int[]{5, 4, 5})); // Ср. балл 4.66
        students.add(new Student("Мария", "A-1", 1, new int[]{2, 2, 3})); // Ср. балл 2.33 (будет удалена)
        students.add(new Student("Петр", "B-2", 2, new int[]{3, 3, 3})); // Ср. балл 3.0
        students.add(new Student("Анна", "B-2", 2, new int[]{4, 5, 4})); // Ср. балл 4.33
        students.add(new Student("Олег", "C-3", 3, new int[]{1, 2, 1})); // Ср. балл 1.33 (будет удален)

        System.out.println("=== Все студенты изначально ===");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\n=== Удаляем неуспевающих (ср. балл < 3) ===");
        University.removeBadStudents(students);

        System.out.println("\n=== Переводим успевающих на следующий курс ===");
        University.promoteStudents(students);

        System.out.println("\n=== Список оставшихся студентов ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Проверяем метод printStudents
        University.printStudents(students, 2);
        University.printStudents(students, 3);
    }
}