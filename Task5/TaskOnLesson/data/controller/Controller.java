package Task5.TaskOnLesson.data.controller;

import Task5.TaskOnLesson.data.User;
import Task5.TaskOnLesson.data.service.DataService;

public class Controller {
    
     private DataService dataService = new DataService();

    public void createUser(User user, String type) {
        dataService.createUser(user, type);
    }

    public void read(String type) {
        System.out.println(dataService.read(type)); 
    }
}
