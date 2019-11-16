package ir.sample.DesignPatternAdapter1;

public class Sparrow implements Bird
{
    // A Concrete Implementation Of Bird ;
    @Override
    public void fly()
    {
        System.out.println("Flying Like An Sparrow");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Cherick Cherick Like An Sparrow");
    }
}
