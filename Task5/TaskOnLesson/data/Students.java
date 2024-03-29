package Task5.TaskOnLesson.data;

public class Students extends User{
    private String direction;

    public Students() {
    }

    public Students(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }
    
    public String getDirection() {
        return direction;
    }
    

    @Override
    public String toString() {
        return "Student {" +
                "direction='" + direction + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age + 
                '}';
    }
}
