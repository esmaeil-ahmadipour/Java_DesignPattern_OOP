package ir.sample.DesignPatternInterpreter1;

public class AdditionExpression implements Expression
{
    //Instance Variables
    private Expression firstExpression, secondExpression;

    //Constructor
    public AdditionExpression(Expression firstExpression, Expression secondExpression)
    {
        //Set Instance Variable
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret()
    {
        //Interpret Addition
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }
}
