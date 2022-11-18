public class Cachier extends AuthorizationChain {

    public Cashier(int level){
       this.level = level;
    }
 
    @Override
    protected void write(String message) {		
       System.out.println("Authorized by cashier" + message);
    }
 }