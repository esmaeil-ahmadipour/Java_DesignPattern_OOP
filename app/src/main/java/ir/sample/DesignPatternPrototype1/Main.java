package ir.sample.DesignPatternPrototype1;


public class Main
{
    public static void main(String[] args)
    {
        Sample mainSample = new Sample("Janson");
        System.out.println(mainSample.getName());

        Sample cloneSample = mainSample.clone();
        cloneSample.setName("David");
        System.out.println(cloneSample.getName());

    }
}
