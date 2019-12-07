package ir.sample.DesignPatternObserver1;

public class HexObserver extends Observer
{
    public HexObserver(Subject subject)
    {
        //Passing Object of Subject For Using
        this.subject = subject;
        // Adding This Observer To observerList
        this.subject.add(this);
    }

    @Override
    public void update()
    {
        System.out.println("    Hex:" + Integer.toHexString(subject.getState()));
    }
}
