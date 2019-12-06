package ir.sample.DesignPatternStrategy1;

public class OperationMultiplication implements Strategy
{

    @Override
    public int doOperation(int number1, int number2)
    {
        return (number1 * number2);
    }
}
