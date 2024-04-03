package Task6;


interface  Driveable{
    void Steers();
    void Drives();

}

interface Flyable {
    void Flflies(); 
    void Maneuvers();
}

class Car implements Driveable {

    @Override
    public void Steers() {
        
    }

    @Override
    public void Drives() {

    }
    
}

class Airplane implements Flyable {
    @Override
    public void Flflies() {
        
    }

    @Override
    public void Maneuvers() {
        
    }
}


