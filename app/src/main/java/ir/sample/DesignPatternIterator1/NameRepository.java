package ir.sample.DesignPatternIterator1;

public class NameRepository implements Container
{
    public String names[] = {"MrWorldWide", "Ricky", "Maluma", "Lopez", "Balvin", "Perry"};

    @Override
    public Iterator getIterator()
    {
        // return an object for Using
        return new NameIterator();
    }

    private class NameIterator implements Iterator
    {
        // this variable refers to Current index
        int index;

        @Override
        public boolean hasNext()
        {
            if (index < names.length)
            {
                // has next index
                return true;
            }
            // out of Array index
            return false;
        }

        @Override
        public Object next()
        {
            if (this.hasNext())
            {
                //  return Current Item in Array (that index to it refers).
                return names[index++];
                // index Variable : Updated to Next index
            }
            return null;
        }
    }
}
