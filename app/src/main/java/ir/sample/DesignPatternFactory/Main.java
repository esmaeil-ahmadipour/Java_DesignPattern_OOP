package ir.sample.DesignPatternFactory;

public class Main
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
        String test1="AbCd";
        String test2="abcD".toLowerCase();
        String test3 = null;

        System.out.println(test2);


    }
}
