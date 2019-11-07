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

        System.out.println("account_accountNumber = "+account._accountNumber);
        System.out.println("account_balance = "+account._balance);
        System.out.println("account_branch = "+account._branch);
        System.out.println("account_interestRate = "+account._interestRate);
        System.out.println("account_owner = "+account._owner);



        BankAccount anotherAccount = new BankAccount.Builder(4567L)
                .withOwner("Homer")
                .atBranch("Springfield2")
                .openingBalance(200)
                .atRate(5)
                .build();

        System.out.println("anotherAccount_accountNumber = "+anotherAccount._accountNumber);
        System.out.println("anotherAccount_balance = "+anotherAccount._balance);
        System.out.println("anotherAccount_branch = "+anotherAccount._branch);
        System.out.println("anotherAccount_interestRate = "+anotherAccount._interestRate);
        System.out.println("anotherAccount_owner = "+anotherAccount._owner);

    }
}
