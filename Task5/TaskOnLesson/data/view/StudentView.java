package Task5.TaskOnLesson.data.view;

import Task5.TaskOnLesson.data.Students;
import Task5.TaskOnLesson.data.controller.Controller;

public class StudentView {

    
    private Controller controller = new Controller();

    public void createStudent(Students stud) {

        controller.createUser(stud, stud.getDirection());
        System.out.println("студент создан успешно");
    }

    public void readStudent() {
        System.out.println("весь список студентов");
        controller.read("student");
    }

}
