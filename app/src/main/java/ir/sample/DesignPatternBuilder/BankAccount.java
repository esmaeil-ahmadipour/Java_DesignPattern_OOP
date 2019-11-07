package ir.sample.DesignPatternBuilder;


public class BankAccount {
    long _accountNumber;
    String _owner;
    String _branch;
    double _balance;
    double _interestRate;

    public static class Builder {
        private long accountNumber; //This is important, so we'll pass it to the constructor.
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }
        public Builder withOwner(String owner){
            this.owner = owner;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }
        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }
        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            //Here we create the actual bank account object, which is always in a fully initialised state when it's returned.
            BankAccount account = new BankAccount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account._accountNumber = this.accountNumber;
            account._owner = this.owner;
            account._branch = this.branch;
            account._balance = this.balance;
            account._interestRate = this.interestRate;
            return account;
        }
    }
    //Fields omitted for brevity.
    private BankAccount() {
        //Constructor is now private.
    }
    //Getters and setters omitted for brevity.
}