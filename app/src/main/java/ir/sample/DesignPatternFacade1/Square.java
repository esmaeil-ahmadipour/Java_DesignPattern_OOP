package ir.sample.DesignPatternFacade1;

public class Square implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Square -> Call Method -> draw()");
    }
}
