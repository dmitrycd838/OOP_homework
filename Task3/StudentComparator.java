package Task3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        String o1Foo = o1.firstName + o2.lastName;
        String o2Foo = o2.firstName + o2.lastName;

        return o1Foo.compareTo(o2Foo);
    }

}
