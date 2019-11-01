package ir.sample.SampleThread2;

public class Main
{
    public static void main(String[] args)
    {
        //Create Sample Objects From Runnable Interface ;
        Sample sampleObject1 = new Sample("threadSample1");
        Sample sampleObject2 = new Sample("threadSample2");
        Sample sampleObject3 = new Sample("threadSample3");

        // Create Thread Objects And Pass Sample Object To Them ;
        Thread threadSample1 = new Thread(sampleObject1, "threadSample1");
        Thread threadSample2 = new Thread(sampleObject2, "threadSample2");
        Thread threadSample3 = new Thread(sampleObject3, "threadSample3");

        //Run Thread ;
        threadSample1.start();
        // with Try-Catch & join() we can set Order For Thread Exceptions;
        try
        {
            //Set Interrupt Time by Milliseconds
            threadSample1.sleep(1500);
            //After Finishing Operations , set Running permission to Next Thread ;
            threadSample1.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        threadSample2.start();
        try
        {
            threadSample2.sleep(1500);
            threadSample2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        threadSample3.start();
        try
        {
            threadSample3.sleep(1500);
            threadSample3.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }


    }

}
