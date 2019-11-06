package ir.sample.DesignPatternSingelton;

public class Main
{
    public static void main(String[] args)
    {
        SingeltonClass objectSample1 = SingeltonClass.getInstance();
        SingeltonClass objectSample2 = SingeltonClass.getInstance();
        System.out.println("Main Class Object 1 :" + objectSample1);
        System.out.println("Main Class Object 1 :" + objectSample2);
        Sample sample = new Sample();
    }
}
