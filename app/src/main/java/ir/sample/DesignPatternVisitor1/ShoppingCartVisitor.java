package ir.sample.DesignPatternVisitor1;

public interface ShoppingCartVisitor
{
    int visit(Book book);

    int visit(Fruit fruit);
}
