package Task4;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book<String> book1 = new Book<>("Медный всадник");
        library.addBook(book1, 1, "А.С.Пушкин", 2023);

        Book<String> book2 = new Book<>("Демон");
        library.addBook(book2, 2, "М.Ю Лермонтов", 2019);

        Book<String> book3 = new Book<>("Отцы и дети");
        library.addBook(book3, 3, "И.С.Тургенев", 2020);

        Book<String> book4 = new Book<>("Война и мир");
        library.addBook(book4, 4, "Л.Н.Толстой", 2018);

        library.displayIssuedBooks();
    }
}
