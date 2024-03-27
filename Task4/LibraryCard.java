package Task4;

import java.util.ArrayList;
import java.util.List;

public class LibraryCard<K, V> {
    K cardNum;
    List<V> bookInfo = new ArrayList<>();

    public LibraryCard(K cardNum, V initialBook) {
        this.cardNum = cardNum;
        bookInfo.add(initialBook);
    }

    public K getCardNum() {
        return cardNum;
    }

    public List<V> getBookList() {
        return bookInfo;
    }

    public void addInfo(V infobook) {
        bookInfo.add(infobook);
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "cardNumber= " +
                "," + bookInfo +
                '}';
    }

}
