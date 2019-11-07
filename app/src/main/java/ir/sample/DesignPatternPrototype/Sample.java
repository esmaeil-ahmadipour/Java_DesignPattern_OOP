package ir.sample.DesignPatternPrototype;

public class Sample implements Prototype
{
    private String name;
    private String password;


    public Sample(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public void showRecords()
    {
        System.out.println("Name:"+name + '\t' + '\t' +"Password:"+ password);
        System.out.println();
    }

    //this method for check Dependency on main_sample Object ;
    public void doNull()
    {
        name = null;
        password = null;
    }

    @Override
    public Prototype getClone()
    {
        return new Sample(name, password);
    }

}
