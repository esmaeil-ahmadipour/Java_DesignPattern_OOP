package ir.sample.DesignPatternAbstractFactory2;

public abstract class MainFactory
{

    abstract Engine getEngine(String engineModel);
    abstract Body getBody(String bodyModel);
    abstract Color getColor(String color);

}
