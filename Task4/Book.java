package Task4;

public class Book<T> {
    private T name; // final

    public Book(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    @Override
    public String toString() {             
        return "Book{" +
                "book title= " + name +
                '}';
    }
}
