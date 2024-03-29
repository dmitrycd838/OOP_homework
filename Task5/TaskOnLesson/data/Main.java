package Task5.TaskOnLesson.data;

import Task5.TaskOnLesson.data.view.StudentView;
import Task5.TaskOnLesson.data.view.TeacherView;

public class Main {

    public static void main(String[] args) {

        Students stud1 = new Students("Иван", 18, "Информатика");
        Students stud2 = new Students("Дима", 19, "Физика");

        StudentView studentView = new StudentView();
        studentView.createStudent(stud1);
        studentView.createStudent(stud2);

        studentView.readStudent();

        System.out.println();

        Teacher teach1 = new Teacher("Виктор", 27, "Математика");
        Teacher teach2 = new Teacher("Евгений", 25, "Литература");

        TeacherView teacherView = new TeacherView();
        teacherView.createTeacher(teach1);
        teacherView.createTeacher(teach2);

        teacherView.readTeacher();
    }
}
