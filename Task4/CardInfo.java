package Task4;

public class CardInfo<T> {
    private T title;
    
   

    public CardInfo(T title) {
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

