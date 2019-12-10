package ir.sample.DesignPatternVisitor1;

public class ShoppingCartVisitorImplement implements ShoppingCartVisitor
{
    @Override
    public int visit(Book book)
    {
        int cost = 0;
        int discount = 5;
        // apply Discount For BookPrice Over 50$
        if (book.getPrice() > 50)
        {
            cost = book.getPrice() - discount;
            System.out.print("Book Price=" + book.getPrice() + " ISBN::" + book.getIsbn());
            System.out.println(" (5$ Discounted)");
        } else
        {
            cost = book.getPrice();
            System.out.println("Book Price=" + book.getPrice() + " ISBN::" + book.getIsbn());
        }
        return cost;
    }

    @Override
    public int visit(Fruit fruit)
    {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit Price=" + cost + " Name::" + fruit.getName());
        return cost;
    }
}
