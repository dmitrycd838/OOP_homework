package Task6;

public class OpenClosed {
    public static void main(String[] args) {
        System.out.println(new CalculateDiscount().getDiscount(200));
    }

}

class CalculateDiscount {  // метод скидка к заказу в 5% 
    public double getDiscount(double price) {  
        return price * 0.95;  
    }
}

class Customer extends CalculateDiscount {  
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 1;
    }
}
