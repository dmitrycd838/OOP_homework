package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator <Student> {

    List<Student> listOfStudents = new ArrayList<Student>();

    public StudyGroupIterator(List<Student> listStud) {
        this.listOfStudents = listStud;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index < listOfStudents.size();
    }

    @Override
    public Student next() {
        return listOfStudents.get(index++);
    }

}
