package ir.sample.DesignPatternAbstractFactory2;

public class BodyFactory extends MainFactory
{
    @Override
    public Body getBody(String bodyModel)
    {
        if (bodyModel == null)
        {
            return null;
        }
        if (bodyModel.equalsIgnoreCase("Santafe"))
        {
            return new SantafeBody();
        }
        if (bodyModel.equalsIgnoreCase("Tiggo"))
        {
            return new TiggoBody();
        }
        if (bodyModel.equalsIgnoreCase("Sportage"))
        {
            return new SportageBody();
        }
        return null;
    }
    @Override
    Color getColor(String color)
    {
        return null;
    }
    @Override
    Engine getEngine(String engineModel)
    {
        return null;
    }
}
