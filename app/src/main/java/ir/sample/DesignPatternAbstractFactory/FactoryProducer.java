package ir.sample.DesignPatternAbstractFactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(String choice)

    {
        if (choice.equalsIgnoreCase("SHAPE"))
        {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("COLOR"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
