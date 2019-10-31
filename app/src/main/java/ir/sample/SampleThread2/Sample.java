package ir.sample.SampleThread2;

public class Sample implements Runnable
{
    String string;

    public Sample()
    {
    }

    public Sample(String string)
    {
        this.string = string;
    }

    // Method Run From Runnable Interface
    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(this.string + " = " + i);

        }
        System.out.println("---------------------");

    }
}
