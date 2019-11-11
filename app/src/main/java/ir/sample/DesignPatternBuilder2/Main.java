package ir.sample.DesignPatternBuilder2;

public class Main
{
    public static void main(String[] args)
    {
        EmailService emailService = new EmailService.Builder("sea2fun")
                .setFirstName("Esmaeil")
                .setLastName("Ahmadipour")
                .setLocation("Tehran,Iran")
                .setPassword("123456")
                .build();
        display_information(emailService , "emailService");
    }
    public static void  display_information(EmailService object , String objName){
        System.out.println(objName+" setUsername = " +object.Username);
        System.out.println(objName+" setFirstName = " +object.FirstName);
        System.out.println(objName+" setLastName = "+object.LastName);
        System.out.println(objName+" setLocation = "+object.Location);
        System.out.println(objName+" setPassword = "+object.Password);
        System.out.println("-----------------------------");

    }

}
