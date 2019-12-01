package ir.sample.DesignPatternChainOfResponsibility1;

public interface DispenseChain
{
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
