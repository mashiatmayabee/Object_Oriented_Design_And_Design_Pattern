public class cashiersAuthorization extends handler{

    @Override
    public bankAccount Withdraw(bankAccount account) {
        int requestedAmount=account.getRequestedAmount();
        if(requestedAmount< 10000){
            System.out.println("Authorized by cashier. And safe to withddraw.");
        }
        else{
            System.out.println("Authorized by cashier.Transfering the request to senior officer")
        }
    }
}
