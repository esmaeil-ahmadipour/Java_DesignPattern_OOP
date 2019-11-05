package ir.sample.DesignPatternFactory;

public class ShapeFactory
{
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
        if (shapeType.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }
        return null;
    }

}
