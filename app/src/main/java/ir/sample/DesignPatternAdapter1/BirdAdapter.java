package ir.sample.DesignPatternAdapter1;

public class BirdAdapter implements ToyDuck
{
    //You Need To Implements The Interface Your Client Expects To Use ;
    Bird bird;

    public BirdAdapter(Bird bird)
    {
        //We Need Reference To The Object , We Are Adapting .
        this.bird=bird;
    }

    @Override
    public void squeak()
    {
        //Translate The Methods Appropriately
        bird.makeSound();
    }
}
