package ir.sample.DesignPatternObserver1;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    public void add(Observer observer)
    {
        observerList.add(observer);
    }

    public int getState()
    {
        //InFact : return inputValue ;
        return state;
    }

    public void setState(int state)
    {
        //set inputValue to state
        this.state = state;
        //result of calling execute() : Set state variable to All observer class
        execute();
    }

    public void execute()
    {
        for (Observer observers : observerList
        )
        {
            //Calling update() from All Observers in List
            observers.update();
        }
    }
}
