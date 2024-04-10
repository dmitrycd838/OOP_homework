package Task7.View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {
    
    Scanner in = new Scanner(System.in);

  
    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    
    public int getChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("\t1. Сложение");
        System.out.println("\t2. Вычитание");
        System.out.println("\t3. Умножение");
        System.out.println("\t4. Деление");
        return in.nextInt();
    }
}
