package ir.sample.DesignPatternFacade1;

public class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Circle -> Call Method -> draw()");
    }
}
