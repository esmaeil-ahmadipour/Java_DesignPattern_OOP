package ir.sample.SampleOverride;


public class Main
{
    public static void main(String[] args)
    {

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.move();
        dog.move();
        dog.sound();

    }
}
