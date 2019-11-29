package ir.sample.SampleConcreteClass;

public class Main extends Product
{
    public static void main(String[] args)
    {
        Main ob=new Main();

        int p = ob.Product(5,10);
        int s = ob.Sum(5,10);

        System.out.println("Sum: "+s);
        System.out.println("Product:"+p);
    }

    @Override
    public int Sum(int a, int b)
    {
        return (a + b);
    }
}
