package ir.sample.DesignPatternStrategy1;

public class Context
{
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeOperation(int number1, int number2)
    {
        return strategy.doOperation(number1, number2);
    }
}
