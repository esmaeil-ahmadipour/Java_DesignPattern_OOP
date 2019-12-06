package ir.sample.DesignPatternInterpreter1;

import java.util.Stack;

import ir.sample.DesignPatternInterpreter1.Utils.Parser;

public class ExpressionParser<result>
{
    Stack stack = new Stack<>();

    public int parse(String string)
    {
        String[] tokenList = string.split(" ");
        //Mean : if symbol is number
        for (String symbol : tokenList)
        {
            if (!Parser.isOperator(symbol))
            {
                //Convert String to Integer
                Expression numberExpression = new NumberExpression(symbol);
                //Add Integer Number to Stack
                stack.push(numberExpression);
                System.out.println(String.format("Pushed to stack: %d", numberExpression.interpret()));
            } else if (Parser.isOperator(symbol))
            {
                Expression firstExpression = (Expression) stack.pop();
                Expression secondExpression = (Expression) stack.pop();
                System.out.println(String.format("Popped operands %d and %d", firstExpression.interpret(), secondExpression.interpret()));
                Expression operator = Parser.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("Applying Operator: %s", operator.interpret()));
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                System.out.println(String.format("Pushed result to stack: %d", resultExpression.interpret()));
            }
        }
        Expression finalResultExpression = (Expression) stack.pop();
        int result = finalResultExpression.interpret();
        return result;
    }
}
