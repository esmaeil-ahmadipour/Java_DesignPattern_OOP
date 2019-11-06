package ir.sample.DesignPatternAbstractFactory2;

public class EngineFactory extends MainFactory
{
    @Override
    public Engine getEngine(String engineModel)
    {
        if (engineModel == null)
        {
            return null;
        }
        if (engineModel.equalsIgnoreCase("Santafe"))
        {
            return new SantafeEngine();
        }
        if (engineModel.equalsIgnoreCase("Tiggo"))
        {
            return new TiggoEngine();
        }
        if (engineModel.equalsIgnoreCase("Sportage"))
        {
            return new SportageEngine();
        }
        return null;
    }
    @Override
    Body getBody(String bodyModel)
    {
        return null;
    }
    @Override
    Color getColor(String color)
    {
        return null;
    }
}
