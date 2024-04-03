package Task6;

import java.util.ArrayList;
import java.util.List;

public class SRP {
    public static void main(String[] args) {

        Order ordr = new Order();
        ordr.addEntry("1");
        OrderLogger od = new OrderLogger();
        od.saveAllText(ordr, "путь/имя файла.txt");
    }
    
}

class Order {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        System.out.println("Заказ создан");
        entries.add(text);
    }

    @Override
    public String toString() {
        return String.join("\n", entries);
    }
}

    

class OrderLogger {
    private boolean check(String filenameOfOrderLogger){
        return true;
    }

    public void saveAllText(Order planner,String path) {
        /// ошибки связанные с cохранением
        if(check(path));///
    }
    
    public void loadFromFile(Order planner,String path) {
        /// ошибки связанные с загрузкой лог файла
        if(check(path));///
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с базой данных
        if(check(url));///
    }    
}