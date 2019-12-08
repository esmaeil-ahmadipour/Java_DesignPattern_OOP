package ir.sample.DesignPatternIterator1;

public class IteratorPatternDemo
{
    public static void main(String[] args)
    {
        NameRepository repository = new NameRepository();
        for (Iterator iterators = repository.getIterator(); iterators.hasNext(); )
        {
            String name = (String) iterators.next();
            System.out.println("name = " + name);
        }
    }
}
