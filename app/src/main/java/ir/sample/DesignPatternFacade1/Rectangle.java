package ir.sample.DesignPatternFacade1;

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Rectangle -> Call Method -> draw()");
    }
}
