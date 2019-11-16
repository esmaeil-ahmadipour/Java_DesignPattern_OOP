package ir.sample.DesignPatternAdapter1;

public class YellowToyDuck implements ToyDuck
{

    @Override
    public void squeak()
    {
        System.out.println("Quack Quack Like An ToyDuck");
    }
}
