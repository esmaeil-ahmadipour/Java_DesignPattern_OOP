package ir.sample.SampleStaticKeyword;

public class Main
{


    public static void main(String[] args)
    {

        Sample.sampleName = "Class A";
        System.out.println(Sample.sampleName);

        Sample.sampleName = "Class B";
        System.out.println(Sample.sampleName);

        Sample sample = new Sample();
        sample.name= "Class C";
        System.out.println(sample.name);

        Sample sample2 = new Sample();
        sample2.name= "Class D";
        System.out.println(sample2.name);

    }
}
