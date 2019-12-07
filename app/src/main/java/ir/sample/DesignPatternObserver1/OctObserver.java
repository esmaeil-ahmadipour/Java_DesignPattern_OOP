package ir.sample.DesignPatternObserver1;

public class OctObserver extends Observer
{
    public OctObserver(Subject subject)
    {
        //Passing Object of Subject For Using
        this.subject = subject;
        // Adding This Observer To observerList
        this.subject.add(this);
    }

    @Override
    public void update()
    {
        System.out.printf("    Octal:" + Integer.toOctalString(subject.getState()));
    }
}
