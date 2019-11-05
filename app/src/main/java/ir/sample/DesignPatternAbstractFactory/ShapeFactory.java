package ir.sample.DesignPatternAbstractFactory;

public class ShapeFactory extends AbstractFactory
{
    @Override
    Color getColor(String color)
    {
        return null;
    }

    //with Name of interface we can Access implemented Classes (example: Create Object from Classes)
    public Shape getShape(String shapeType)
    {
        if (shapeType == null)
        {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        return null;
    }

}
