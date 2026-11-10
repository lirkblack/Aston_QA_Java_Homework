import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class University {

    // 1. Метод, который удаляет студентов со средним баллом < 3
    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove(); // Безопасное удаление через итератор
                System.out.println("Удален студент: " + student.getName());
            }
        }
    }

    // 2. Метод, который переводит студентов на следующий курс (если ср. балл >= 3)
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
                System.out.println("Студент " + student.getName() + " переведен на " + student.getCourse() + " курс.");
            }
        }
    }

    // 3. Метод, который печатает студентов заданного курса
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("\nСтуденты " + course + " курса:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("- " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На этом курсе нет студентов.");
        }
    }
}