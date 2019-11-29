package ir.sample.DesignPatternFacade1;

public class FacadePatternDemo
{
    public static void main(String[] args)
    {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawCRectangle();
        shapeMaker.drawSquare();
    }
}
