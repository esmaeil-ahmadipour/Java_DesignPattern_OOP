package ir.sample.DesignPatternInterpreter1;

public class SubtractionExpression implements Expression
{
    //Instance Variables
    private Expression firstExpression, secondExpression;


    //Constructor
    public SubtractionExpression(Expression firstExpression, Expression secondExpression)
    {
        //Set Instance Variable
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret()
    {
        //Interpret Subtraction
        return this.firstExpression.interpret() - this.secondExpression.interpret();
    }
}
