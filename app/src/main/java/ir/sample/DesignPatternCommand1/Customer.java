package ir.sample.DesignPatternCommand1;

public class Customer
{
    public static void main(String[] args)
    {
        CookingStaff cookingStaff = new CookingStaff();
        LunchOrder lunchOrder = new LunchOrder(cookingStaff);
        DinnerOrder dinnerOrder = new DinnerOrder(cookingStaff);

        Waiter waiter=new Waiter();
        waiter.placeOrder(lunchOrder);
        waiter.placeOrder(dinnerOrder);
    }
}
