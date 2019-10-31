package ir.sample.SampleGeneric2;

public class Main
{
    //Test Data by FLOAT_VALUE ;
    static float FLOAT_VALUE = 15.5f;

    public static void main(String[] args)
    {
        //Instance of Generic Class (Sample)
        Sample<Float> floatSample = new Sample<>(FLOAT_VALUE);
        //Get Data From Class Sample by (GetterMethod)
        Float number = floatSample.getItem();
        //Display (Return Value) From Class Sample
        System.out.println(number);
    }
}
