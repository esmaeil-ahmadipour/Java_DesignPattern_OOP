package ir.sample.SampleCollection1;

import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        Sample sample = new Sample();
        sample.stringArrayList.add("Ali");
        sample.stringArrayList.add("Vahid");
        sample.stringArrayList.add("Saeed");


        Iterator iterator = sample.stringArrayList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}