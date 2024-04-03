package Task6;


interface MainLogger {

    void text();

    void numbers();

}

class Logger implements MainLogger {

    public void text() {

    }

    public void numbers() {

    }
}

class FileLogger {

    private MainLogger text;

    public FileLogger(MainLogger mainLogger) {
        this.text = mainLogger;
    }

    public void writingtext() {
        text.numbers();
    }

}

class DatabaseLogger implements MainLogger {
    @Override
    public void text() {
        
    }

    @Override
    public void numbers() {
        
    }
}