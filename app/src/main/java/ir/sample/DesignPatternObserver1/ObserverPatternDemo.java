package ir.sample.DesignPatternObserver1;

import java.util.Scanner;

public class ObserverPatternDemo
{
    public static void main(String[] args)
    {
        //We Just Have One Object From ClassSubject
        Subject subject = new Subject();

        //result : Add children of Observer to observerList
        new BinaryObserver(subject);
        new OctObserver(subject);
        new HexObserver(subject);

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter a number: ");

        //Passing inputValue to setState();
        subject.setState(inputValue.nextInt());

    }
}
