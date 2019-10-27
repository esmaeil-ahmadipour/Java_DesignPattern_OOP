package ir.sample.SampleGeneric3;

public class Sample
{
    public <E> void printArray(E[] inputArray)
    {
        for (E element : inputArray)
        {
            System.out.println(element);
        }
    }
}
