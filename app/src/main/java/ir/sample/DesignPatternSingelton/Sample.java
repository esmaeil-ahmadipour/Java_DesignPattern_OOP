package ir.sample.DesignPatternSingelton;

public class Sample
{

    public Sample()
    {
        SingeltonClass object1 = SingeltonClass.getInstance();
        SingeltonClass object2 = SingeltonClass.getInstance();

        System.out.println("Sample Class Object1: "+object1);
        System.out.println("Sample Class Object1: "+object2);
    }
}
