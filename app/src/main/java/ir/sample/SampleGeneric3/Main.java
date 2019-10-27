package ir.sample.SampleGeneric3;


public class Main
{

    public static void main(String[] args)
    {
        Sample sample = new Sample();
        Integer[] intArray = {1,2,3};
        Character [] charArray={'A','B','C'};
        Double [] doubleArray = {1.1 , 2.2 , 3.3};

        System.out.println("Integer Array");
        sample.printArray(intArray);

        System.out.println("Character Array");
        sample.printArray(charArray);

        System.out.println("Double Array");
        sample.printArray(doubleArray);

    }
}
