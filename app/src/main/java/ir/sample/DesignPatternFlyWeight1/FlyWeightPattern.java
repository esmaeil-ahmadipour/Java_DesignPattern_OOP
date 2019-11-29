package ir.sample.DesignPatternFlyWeight1;

public class FlyWeightPattern
{
    private static final String color[] = {"Red", "Pink", "Green", "Blue", "Black"};

    public static void main(String[] args)
    {
        //Create 10 Circle with Random Data
        for (int i = 0; i < 10; i++)
        {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRadius());
            circle.draw();
        }
    }

    private static String getRandomColor()
    {
        return color [(int) (Math.random()*color.length)];
    }
    private static int getRandomX()
    {
        return (int) (Math.random()*100);
    }
    private static int getRandomY()
    {
        return (int) (Math.random()*100);
    }
    private static int getRadius()
    {
        return 100;
    }
}
