package ir.sample.SampleCollection2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {
        Sample student1 = new Sample(1, "Ali", 25);
        Sample student2 = new Sample(2, "Vahid", 20);
        Sample student3 = new Sample(3, "Saeid", 23);

        ArrayList<Sample> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        ArrayList<Sample> studentList2 = new ArrayList<>();
        studentList.add(student3);

        studentList.addAll(studentList2);

        Iterator iterator = studentList.iterator();
        while (iterator.hasNext())
        {

            Sample student = (Sample) iterator.next();

            System.out.println(" student.idNumber="+student.idNumber+" student.name="+student.name+" student.age="+student.age);
        }


    }
}
