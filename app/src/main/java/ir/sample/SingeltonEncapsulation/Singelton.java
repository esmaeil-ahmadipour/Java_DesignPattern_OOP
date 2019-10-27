package ir.sample.SingeltonEncapsulation;

public class Singelton
{
    private Singelton()
    {
    }

    public static Singelton singelton = new Singelton();

    public Singelton getSingelton()
    {

        return singelton;
    }

    public int SumNumbers(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

}
