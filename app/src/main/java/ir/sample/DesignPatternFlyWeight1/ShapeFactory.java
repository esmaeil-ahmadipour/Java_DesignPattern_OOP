package ir.sample.DesignPatternFlyWeight1;

import java.util.HashMap;

public class ShapeFactory
{
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color)
    {   //HashMap get() method in java : if an existing key is passing then the previous value gets returned . if a new pairs is pressed , then null is returned.
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null)
        {
            circle = new Circle(color);
            //HashMap put() method in java : Used for insert a specific key and the value it is mapping to into a particular map.
            circleMap.put(color, circle);
            System.out.println("Creating Circle Of Color : " + color);
        }
        return circle;
    }
}
