package ir.sample.SampleArray;

public class Sample
{
    public int[] arrInteger;

    public Sample()
    {

        arrInteger = new int[6];
        for (int i = 0; i < arrInteger.length; i++)
        {
            arrInteger[i] = i;
        }
        for (int elements : arrInteger)
        {
            System.out.println("sample without input :" + elements);
        }
    }

    public Sample(int arrayNumber)
    {

        arrInteger = new int[arrayNumber];


        for (int i = 0; i < arrInteger.length; i++)
        {
            arrInteger[i] = i;
            System.out.println("sample with input :" + arrInteger[i]);
        }


    }

}
