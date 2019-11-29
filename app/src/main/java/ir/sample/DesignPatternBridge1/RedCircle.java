package ir.sample.DesignPatternBridge1;

public class RedCircle implements DrawAPI
{

    @Override
    public void drawCircle(int radius, int x, int y)
    {
        System.out.println("Drawing Circle [ color: Red , radius: "+radius+" x: "+x+" y: "+y+" ]");
    }
}
