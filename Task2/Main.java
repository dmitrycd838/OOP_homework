package Task2;

public class Main {
    public static void main(String[] args) {
        
        Actor human1 = new Human("Dima");
        Actor human2 = new Human("Vasya");
        // System.out.println(human1.getName());
        Market market = new Market();
        
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.takeOrders();
        market.takeInQueue(human1);
        market.takeInQueue(human2);
        market.giveOrders();
        market.giveOrders();
        market.releaseFromQueue();
               
    }
}
