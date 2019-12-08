package ir.sample.MediatorPatternDemo1;

public class MediatorPatternDemo
{
    public static void main(String[] args)
    {
        User robert = new User();
        User john = new User();

        robert.setName("Robert Jackson");
        john.setName("John Ford");

        robert.sendMessage("Hello John !");
        john.sendMessage("Hi Robert !");
    }
}
