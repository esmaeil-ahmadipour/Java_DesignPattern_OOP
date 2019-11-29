package ir.sample.DesignPatternDecorator1;

public class LuxuryCar extends CarDecorator
{

    public LuxuryCar(Car car)
    {
        super(car);
    }

    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Features Of LuxuryCar .");

    }
}
