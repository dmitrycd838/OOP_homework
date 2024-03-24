package Task2;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Market implements MarketBehavior, QueueBehavior {

    private List<Actor> marketActors; // лист посетителей
    private Queue<Actor> actorsQueue; // лист очереди

    public Market() {

        this.marketActors = new LinkedList<Actor>();
        this.actorsQueue = new LinkedList<Actor>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("клиент " + actor.getName() + " пришел в мазазин");
        marketActors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            if (actor.isTakeOrder) {
                System.out.println(actor.getName() + " вышел из магазина с полученным заказом");
                actors.remove(actor);
            }    

            if (actors.isEmpty()) {
            System.out.println("нет покупателя");
            }
        }
    }

    @Override
    public void takeInQueue(Actor actor) {
        if (actor.isMakeOrder){
            actorsQueue.add(actor);
            System.out.println(actor.getName() + " встал в очередь");
        }              
    }

    @Override
    public void takeOrders() {
        for (Actor actor : marketActors) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder();
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actorsQueue) {
            actor.setTakeOrder();
            actor.isMakeOrder = false;           
            System.out.println(actor.getName() + " вышел из магазина");
            releaseFromQueue();
            }
        }
       
    @Override
    public void releaseFromQueue() {
        actorsQueue.poll();
        releaseFromMarket(marketActors);
    }
}

