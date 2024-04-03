package Task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liskov {

    public static void main(String[] args) {
         List<Figures> list1 = new ArrayList<>(Arrays.asList(new Rectangle(), new Square()));
        for (var figures : list1) {
            System.out.println(figures.getType());
        }

        List<Sides> list2 = new ArrayList<>(Arrays.asList(new Rectangle(), new Square()));
        for (var figures : list2) {
            System.out.println(figures.getLegsCount());

        }
    }    
}

abstract class Figures {
    public String getType() {
        return "Фигуры";
    }
}

interface Sides {
    int getLegsCount();
}

class Rectangle extends Figures implements Sides {

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Square extends Rectangle {
    @Override
    public String getType() {
        return "Квадрат";
    }
}