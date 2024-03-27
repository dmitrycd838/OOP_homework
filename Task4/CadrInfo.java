package Task4;

public class Library<T> {
    
    private T title;
    
    public Library(T title) {
        this.title = title;
        
    }

    public T getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "CardInfo\n{" +
                "title=" + title +
                '}';
    }
}

