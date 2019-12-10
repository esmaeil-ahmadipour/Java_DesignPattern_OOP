package ir.sample.DesignPatternVisitor1;

public class ShoppingCartClient
{
    public static void main(String[] args)
    {
        ItemElement[] items = new ItemElement[]{
                new Book(100, "778596"),
                new Fruit(35, 2, "Banana"),
                new Book(45, "988875"),
                new Fruit(25, 3, "Apple"),
        };
        int totalCost = calculatePrice(items);
        System.out.println("Total Cost is : " + totalCost);
    }

    public static int calculatePrice(ItemElement[] item)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImplement();
        int sum = 0;
        for (ItemElement items : item)
        {
            sum = sum + items.accept(visitor);
        }
        return sum;
    }
}
