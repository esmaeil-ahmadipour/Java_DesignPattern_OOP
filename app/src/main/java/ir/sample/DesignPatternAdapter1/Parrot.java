package ir.sample.DesignPatternAdapter1;

public class Parrot implements Bird
{
    // A Concrete Implementation Of Bird ;

        @Override
        public void fly()
        {
            System.out.println("Flying Like An Parrot");
        }

        @Override
        public void makeSound()
        {
            System.out.println("Make Sound Like An Parrot");
        }


}
