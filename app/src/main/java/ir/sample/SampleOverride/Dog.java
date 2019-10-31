package ir.sample.SampleOverride;

public class Dog extends Animal
{
    @Override
    public void move()
    {
        super.move();
    }


    public void sound()
    {
        System.out.println("Hap Hap");

    }


}
