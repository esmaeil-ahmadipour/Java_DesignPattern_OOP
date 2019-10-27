package ir.sample.SampleGeneric2;

public class Sample <T>
{
    private T item;

    //Constructor for Save Data in (field item)
    public Sample(T item)
    {
        this.item = item;
    }

    //Getter for (parameter T)
    public T getItem()
    {
        return item;
    }
}
