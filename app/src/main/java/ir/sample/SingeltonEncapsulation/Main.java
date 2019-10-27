package ir.sample.SingeltonEncapsulation;


public class Main
{
    public static void main(String[] args)
    {
        int number1 = 12;
        int number2=5;

        int result;

        Encapsulation encapsulation=new Encapsulation();

        encapsulation.setName("Set Name By Encapsulation !");
        System.out.println("[" + encapsulation.getName() + "]");
        result=Singelton.singelton.SumNumbers(number1,number2);
        System.out.println("[Sum "+number1+" & "+number2+" By Singelton . result is:" + result + "]");


    }
}
