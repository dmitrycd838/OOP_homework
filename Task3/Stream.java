package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {

    private List<StudyGroup> listOfGroups = new ArrayList<StudyGroup>();

    public Stream(List<StudyGroup> groups) {
        this.listOfGroups = groups;
    }

    public List<StudyGroup> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(List<StudyGroup> groups) {
        this.listOfGroups = groups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {

        Iterator<StudyGroup> iterstud = new Iterator<StudyGroup>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < listOfGroups.size();
            }

            @Override
            public StudyGroup next() {
                return listOfGroups.get(index++);
            }
        };
        return iterstud;
    }

}
