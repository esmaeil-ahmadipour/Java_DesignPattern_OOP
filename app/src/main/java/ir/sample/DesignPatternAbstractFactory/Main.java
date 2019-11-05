package ir.sample.DesignPatternAbstractFactory;

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactory abstractFactoryShape = FactoryProducer.getFactory("SHAPE");
        AbstractFactory abstractFactoryColor = FactoryProducer.getFactory("COLOR");

        Shape shapeSample = abstractFactoryShape.getShape("Circle");
        Color colorSample = abstractFactoryColor.getColor("Red");
        shapeSample.draw();
        colorSample.fill();
    }
}
