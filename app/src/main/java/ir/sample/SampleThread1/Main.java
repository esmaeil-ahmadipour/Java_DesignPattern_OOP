package ir.sample.SampleThread1;

public class Main
{
    public static void main(String[] args)
    {
        //Create Object From Thread Class ;
        Sample sampleObject = new Sample();

        // Create Thread Object And Pass Thread Object To Them ;
        Thread threadSample = new Thread(sampleObject, "threadSample");

        //Run Thread ;
        threadSample.start();

        //Another Methods Of Thread Objects;
        threadSample.setName("threadSampleName");
        threadSample.setPriority(1);
        System.out.println("getName = " + threadSample.getName());
        System.out.println("getPriority = " + threadSample.getPriority());
        System.out.println("getState = " + threadSample.getState());
        System.out.println("getId = " + threadSample.getId());
     }

}
