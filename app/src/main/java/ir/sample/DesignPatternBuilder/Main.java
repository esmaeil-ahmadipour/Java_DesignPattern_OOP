package ir.sample.DesignPatternBuilder;

public class Main
{
    public static void main(String[] args)
    {

        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        display_information(account,"account");


        BankAccount anotherAccount = new BankAccount.Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield2")
                .openingBalance(200)
                .atRate(5)
                .build();

        display_information(anotherAccount,"anotherAccount");


    }
    public static void  display_information(BankAccount object , String objName){
        System.out.println(objName+"_accountNumber = " +object._accountNumber);
        System.out.println(objName+"_balance = "+object._balance);
        System.out.println(objName+"_branch = "+object._branch);
        System.out.println(objName+"_interestRate = "+object._interestRate);
        System.out.println(objName+"_owner = "+object._owner);
        System.out.println("-----------------------------");

    }
}
