package ir.sample.DesignPatternAbstractFactory2;

public class FactoryProducer
{

    public static MainFactory getFactory(String choice)
    {
        if (choice.equalsIgnoreCase("ENGINE"))
        {
            return new EngineFactory();
        }
        if (choice.equalsIgnoreCase("COLOR"))
        {
            return new ColorFactory();
        }
        if (choice.equalsIgnoreCase("BODY"))
        {
            return new BodyFactory();
        }
        return null;

    }
}
