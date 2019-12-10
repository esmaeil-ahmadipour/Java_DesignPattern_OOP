package ir.sample.DesignPatternVisitor1;

public interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}
