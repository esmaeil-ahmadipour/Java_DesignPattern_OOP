package ir.sample.DesignPatternInterpreter1;

public class MultiplicationExpression implements Expression
{
    //Instance Variables
    private Expression firstExpression, secondExpression;

    //Constructor
    public MultiplicationExpression(Expression firstExpression, Expression secondExpression)
    {
        //Set Instance Variable
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret()
    {
        //Interpret Multiplication
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }
}
