package ir.sample.DesignPatternInterpreter1;

public class NumberExpression implements Expression
{
    private int number;

    public NumberExpression(String number)
    {
        //Convert String To Integer And Set Instance Variable
        this.number = Integer.parseInt(number);
    }

    public NumberExpression(int number)
    {
        //Set Instance Variable
        this.number = number;
    }

    @Override
    public int interpret()
    {
        //Return Instance Variable
        return this.number = number;
    }
}
