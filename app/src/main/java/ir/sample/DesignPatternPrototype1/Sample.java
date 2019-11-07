package ir.sample.DesignPatternPrototype1;


public class Sample implements Cloneable
{
    private String name;

    public Sample(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    protected Sample clone()
    {
        return new Sample(name);
    }
}
