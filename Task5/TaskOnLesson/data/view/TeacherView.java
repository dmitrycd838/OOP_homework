package Task5.TaskOnLesson.data.view;

import Task5.TaskOnLesson.data.Teacher;
import Task5.TaskOnLesson.data.controller.Controller;

public class TeacherView {

    private Controller controller = new Controller();

    public void createTeacher(Teacher teach) {

        controller.createUser(teach, teach.getDiscipline());
        System.out.println("учитель создан успешно");
    }

    public void readTeacher() {
        System.out.println("весь список учителей:");
        controller.read("teacher");
    }    
}
