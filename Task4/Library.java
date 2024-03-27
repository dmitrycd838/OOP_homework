package Task4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    
    protected List<LibraryCard<Integer, String>> issuedBooks; 

    public Library() {
        this.issuedBooks = new ArrayList<>();
    }

    public <T> void addBook(Book<T> book, int cardNumber, String author, String title) {
        LibraryCard<Integer, String> card = new LibraryCard<>(cardNumber, "Автор: " + author + ", Название книги: " + title);
        issuedBooks.add(card);
    }


    public LibraryCard<Integer, String> lendBook(int cardNumber) {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            if (card.getCardNumber() == cardNumber) {
                return card;
            }
        }
        return null;
    }


    public void displayIssuedBooks() {
        for (LibraryCard<Integer, String> card : issuedBooks) {
            System.out.println("Номер карты: " + card.getCardNumber() +  "; Книга: " + card.getBookInfo());
        }
    }
}
