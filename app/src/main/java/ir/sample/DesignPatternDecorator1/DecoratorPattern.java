package ir.sample.DesignPatternDecorator1;

public class DecoratorPattern
{
    public static void main(String[] args)
    {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n****\n");
        Car sportsLuxuryCar=new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
