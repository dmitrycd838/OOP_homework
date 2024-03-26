package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listStudents1 = new ArrayList<Student>(List.of(
                new Student("Vasya", "Petrov", 19),
                new Student("Dima", "Ivanov", 18),
                new Student("Petya", "Sidorov", 20),
                new Student("Sasha", "Smirnov", 21)));

        List<Student> listStudents2 = new ArrayList<Student>(List.of(
                new Student("Katya", "Pupkina", 20),
                new Student("Masha", "Selivanova", 19),
                new Student("Pasha", "Pavlov", 22),
                new Student("Dasha", "Bob", 18)));

        List<Student> listStudents3 = new ArrayList<Student>(List.of(
                new Student("Egor", "Novikov", 21),
                new Student("Oleg", "Viktorov", 22),
                new Student("Eva", "Kan", 18),
                new Student("Georg", "Andreev", 19)));

        List<StudyGroup> listGroup1 = new ArrayList<StudyGroup>(List.of(
                new StudyGroup(listStudents1),
                new StudyGroup(listStudents2)));

        List<StudyGroup> listGroup2 = new ArrayList<StudyGroup>(List.of(new StudyGroup(listStudents3)));

        Stream stream1 = new Stream(listGroup1);
        Stream stream2 = new Stream(listGroup2);

        Iterator<StudyGroup> iteratorGroups = stream1.iterator();

        while (iteratorGroups.hasNext()) {
            System.out.println(iteratorGroups.next());
        }

        iteratorGroups = stream2.iterator();

        System.out.println();

        while (iteratorGroups.hasNext()) {
            System.out.println(iteratorGroups.next());
        }

        StreamComparator streamCompar = new StreamComparator();
        System.out.println();
        System.out.println(streamCompar.compare(stream1, stream2));
        System.out.println(streamCompar.compare(stream1, stream1));
    }

}
