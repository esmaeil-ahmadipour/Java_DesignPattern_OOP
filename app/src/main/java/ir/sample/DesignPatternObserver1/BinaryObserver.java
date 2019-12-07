package ir.sample.DesignPatternObserver1;

public class BinaryObserver extends Observer
{
    public BinaryObserver(Subject subject)
    {
        //Passing Object of Subject For Using
        this.subject = subject;
        // Adding This Observer To observerList
        this.subject.add(this);
    }

    @Override
    public void update()
    {
        System.out.printf(" Binary:" + Integer.toBinaryString(this.subject.getState()));
    }
}
