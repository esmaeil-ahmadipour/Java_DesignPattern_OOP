package ir.sample.DesignPatternPrototype;

public class Main
{
    public static void main(String[] args)
    {

        String e_name = "Emmy";
        String e_password = "A1234567@";
        Sample main_sample = new Sample(e_name, e_password);


        // clone_sample isn't dependency to main_sample ;
        Sample clone_sample = (Sample) main_sample.getClone();

        // (variable copy_sample) is Copy of (variable main_sample) ;
        // copy_sample is dependency to main_sample ;
        Sample copy_sample;
        copy_sample = main_sample;

        // just for Check Dependency on main_sample Uncomment Next Line;
        //main_sample.doNull();

        System.out.println("Main Sample: " + main_sample);
        main_sample.showRecords();

        System.out.println("Clone Sample: " + clone_sample);
        clone_sample.showRecords();

        System.out.println("Copy Sample: " + copy_sample);
        copy_sample.showRecords();


    }
}
