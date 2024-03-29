package Task5.TaskOnLesson.data.service;

import java.util.ArrayList;
import java.util.List;

import Task5.TaskOnLesson.data.Students;
import Task5.TaskOnLesson.data.Teacher;
import Task5.TaskOnLesson.data.User;

public class DataService {

    private List<User> stuList = new ArrayList<>();

    private List<User> teaList = new ArrayList<>();
    
    public void createUser(User user, String type){
        if (user instanceof Students) {
            stuList.add(new Students(user.getName(), user.getAge(), type));
        } else {
            teaList.add(new Teacher(user.getName(), user.getAge(), type));
        }
    } 

    public List<User> read(String type) {
        if (type.equals("student")){
            return stuList;
        } else if (type.equals("teacher")){
            return teaList;
        }
        System.out.println("не найдено");
        return null;
    }
}
