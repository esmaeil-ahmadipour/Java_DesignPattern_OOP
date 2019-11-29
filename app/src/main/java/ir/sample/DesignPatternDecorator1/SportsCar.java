package ir.sample.DesignPatternDecorator1;

public class SportsCar extends CarDecorator
{

    public SportsCar(Car car)
    {
        super(car);
    }

    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("Adding Features Of SportsCar .");
    }
}
