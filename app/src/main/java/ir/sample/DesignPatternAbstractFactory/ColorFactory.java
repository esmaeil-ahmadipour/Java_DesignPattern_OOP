package ir.sample.DesignPatternAbstractFactory;

public class ColorFactory extends AbstractFactory
{

    //with Name of interface we can Access implemented Classes (example: Create Object from Classes)
    public Color getColor(String colorType)
    {
        if (colorType == null)
        {
            return null;
        }
        if (colorType.equalsIgnoreCase("Red"))
        {
            return new Red();
        }
        if (colorType.equalsIgnoreCase("Green"))
        {
            return new Green();
        }
        if (colorType.equalsIgnoreCase("Blue"))
        {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape)
    {
        return null;
    }

}
