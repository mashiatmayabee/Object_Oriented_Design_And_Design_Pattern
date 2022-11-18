public static void main(String[] args) {
    Account account = new Account(accName, balance);
    authorizationchain = new AuthorizationChain();
    amount = 10000;
    isAuthorized = authorizationchain.authorizeWithdrawal(account, amount);

    if(isAuthorized){
        account.withdraw(amount);
    }
}