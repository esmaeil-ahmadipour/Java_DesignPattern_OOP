package ir.sample.SampleGeneric1;

public class Main
{
    public static void main(String[] args)
    {
        //Define TypeValues For (Generic Class Object);
        Sample<String, Double> sample = new Sample();

        //Set value For Object Members (According to Defined TypeValues) ;
        sample.value_T="abcd";
        sample.value_V=1.25;

        //Display Value of Object Members;
        System.out.println("sample.value_T:  "+sample.value_T);
        System.out.println("sample.value_V:  "+sample.value_V);
    }
}
