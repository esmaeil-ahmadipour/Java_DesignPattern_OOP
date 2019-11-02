package ir.sample.SampleCasting;

public class Main
{
    public static void main(String[] args)
    {
        double doubleVar = 20.32;

        int integerVar = (int) doubleVar;
        System.out.println("Cast double to int : " + integerVar);

        String stringVar = "20.53";
        double doubleVariable = Double.parseDouble(stringVar);
        System.out.println("Cast String to Double : " + doubleVariable);
    }

}
