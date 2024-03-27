package Task4;

public class LibraryCard<K, V> {
    protected K cardNumber;
    protected V bookInfo;

    public LibraryCard(K cardNumber, V bookInfo) {
        this.cardNumber = cardNumber;
        this.bookInfo = bookInfo;
    }

    public K getCardNumber() {
        return cardNumber;
    }

    public V getBookInfo() {
        return bookInfo;
    }
}