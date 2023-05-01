import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lesson> listLessons = new ArrayList<>();
        Lesson lect1 = new Lecture(40, 15);
        Lesson lab1 = new LabLesson(60, 20);
        Lesson sem1 = new Seminar(50, 10);
        Lesson lect2 = new Lecture(45, 5);
        Lesson lab2 = new LabLesson(70, 30);
        Lesson sem2 = new Seminar(40, 15);
        listLessons.add(lect1);
        listLessons.add(lab2);
        listLessons.add(sem1);
        listLessons.add(lab1);
        listLessons.add(lect2);
        listLessons.add(sem2);
        LessonStatsVisitor LSV = new LessonStatsVisitor();
        for (Lesson less : listLessons) {
            less.accept(LSV);
        }
        System.out.println("Количество часов: " + LSV.getTotalHours());
        System.out.println("Максимальный балл: " + LSV.getMaxScore());
    }
}