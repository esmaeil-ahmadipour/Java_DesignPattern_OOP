package ir.sample.SampleException;

public class Main
{
    public static void main(String[] args)
    {
        boolean exceptionErrorCheck = false;

        Sample sample = new Sample();

        try
        {
            sample.setAge(-1);
            System.out.println("try Block");
        } catch (CustomException e)
        {
            System.out.println("catch Block");
            exceptionErrorCheck = true;
        // e.printStackTrace();
        } finally
        {
            if (exceptionErrorCheck)
            {
                System.out.println("finally Block : Error Code !");

            } else
            {
                System.out.println("finally Block : Safe Code !");
            }

        }
    }
}
