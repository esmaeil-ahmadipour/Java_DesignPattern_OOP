package ir.sample.DesignPatternInterpreter1.Utils;

import ir.sample.DesignPatternInterpreter1.AdditionExpression;
import ir.sample.DesignPatternInterpreter1.Expression;
import ir.sample.DesignPatternInterpreter1.MultiplicationExpression;
import ir.sample.DesignPatternInterpreter1.SubtractionExpression;

public class Parser
{
    public static boolean isOperator(String symbol)
    {
        return (symbol.equals("+") || symbol.equals("-") || symbol.equals("*"));
    }

    public static Expression getExpressionObject(Expression firstExpression, Expression secondExpression, String symbol)
    {
        if (symbol.equals("+"))
        {
            return new AdditionExpression(firstExpression, secondExpression);
        } else if (symbol.equals("-"))
        {
            return new SubtractionExpression(firstExpression, secondExpression);
        } else
        {
            return new MultiplicationExpression(firstExpression, secondExpression);
        }
    }
}