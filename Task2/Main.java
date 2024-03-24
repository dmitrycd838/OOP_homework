package Task2;

public class Main {
    public static void main(String[] args) {
        
        Human human = new Human("dima");
        System.out.println(human.getName());
        System.out.println(human.isMakeOrder);
        System.out.println(human.isTakeOrder);
        human.setMakeOrder();
        human.setTakeOrder();
        System.out.println(human.isMakeOrder);
        System.out.println(human.isTakeOrder);

    }
}
