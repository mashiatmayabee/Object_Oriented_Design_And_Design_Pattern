public class ChainPattern {
	
    private static AuthorizationChain getChainOfLoggers(){
 
       AuthorizationChain cashier = new Cashier(AuthorizationChain.cashier);
       AuthorizationChain seniorOfficer = new SeniorOfficer(AuthorizationChain.seniorOffiicer);
       AuthorizationChain manager = new Manager(AuthorizationChain.manager);
 
       seniorOfficer.setNextAuthorizer(manager);
       manager.setNextAuthorizer(cashier);
 
       return seniorOfficer;	
    }
 
    public static void main(String[] args) {
       AuthorizationChain loggerChain = getChainOfLoggers();
 
       loggerChain.logMessage(AuthorizationChain.cashier, 
          "Authorizer by cashier");
 
       loggerChain.logMessage(AuthorizationChain.seniorOfficer, 
          "Authorized by senior officer");
 
       loggerChain.logMessage(AuthorizationChain.manager, 
          "Authorized by manager.");
    }
 }