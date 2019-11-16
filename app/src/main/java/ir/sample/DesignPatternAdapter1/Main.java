package ir.sample.DesignPatternAdapter1;

public class Main
{
    public static void main(String[] args)
    {
        Sparrow  sparrow= new Sparrow();
        Parrot parrot = new Parrot();
        ToyDuck toyDuck=new YellowToyDuck();

        //Wrap An Sparrow In A BirdAdapter
        ToyDuck sparrowAdapter=new BirdAdapter(sparrow);
        //Wrap An parrot In A BirdAdapter
        ToyDuck parrotAdapter=new BirdAdapter(parrot);

        fly_makeSound(sparrow,"sparrow");
        fly_makeSound(parrot,"parrot");

        squeakSound(toyDuck,"toyDuck");
        squeakSound(parrotAdapter,"parrotAdapter");
        squeakSound(sparrowAdapter,"sparrowAdapter");

    }
    public static void fly_makeSound(Bird birdSample , String nameSample){
        System.out.println(nameSample+"...");
        birdSample.fly();
        birdSample.makeSound();
    }
    public static void squeakSound(ToyDuck birdSample, String nameSample){
        //ToyDuck Behaving Like A Bird ...
        System.out.println(nameSample+"...");
        birdSample.squeak();
    }
}
