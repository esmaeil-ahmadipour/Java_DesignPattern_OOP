package ir.sample.DesignPatternAbstractFactory2;

public class ColorFactory extends MainFactory
{
    @Override
    public Color getColor(String color)
    {
        if (color == null)
        {
            return null;
        }
        if (color.equalsIgnoreCase("Red"))
        {
            return new RedColor();
        }
        if (color.equalsIgnoreCase("Black"))
        {
            return new BlackColor();
        }
        if (color.equalsIgnoreCase("White"))
        {
            return new WhiteColor();
        }
        return null;
    }
    @Override
    Engine getEngine(String engineModel)
    {
        return null;
    }
    @Override
    Body getBody(String bodyModel)
    {
        return null;
    }
}
