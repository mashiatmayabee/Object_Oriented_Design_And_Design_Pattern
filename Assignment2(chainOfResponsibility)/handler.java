
public abstract class handler {

    protected Handler sucessor;

    public void setSucessor(handler sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract bankAccount Withdraw(bankAccount account);
    
}