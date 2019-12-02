package ir.sample.DesignPatternCommand1;

public class Waiter
{
    public void placeOrder(Order order){
        order.execute();
    }
}
