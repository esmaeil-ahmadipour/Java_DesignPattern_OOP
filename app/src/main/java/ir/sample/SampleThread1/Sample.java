package ir.sample.SampleThread1;

/************************************************************************
 * We Can Use Another Way To Define This Class And Get Similar Result : *
 * public class Sample implements Runnable                              *
 ************************************************************************/

public class Sample extends Thread
{
    // Method Run From Runnable Interface (inherited to Thread Classes)
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("i = " + i);
        }
    }
}
