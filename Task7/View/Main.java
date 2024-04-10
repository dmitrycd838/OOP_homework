package Task7.View;

import Task7.Functions.Presenter;
import Task7.Operations.Model;


public class Main {

    
    public static void main(String[] args) {

        
        Presenter presenter  = new Presenter(new UI(), new Model());

        presenter.runOperation();

    }
    
}
