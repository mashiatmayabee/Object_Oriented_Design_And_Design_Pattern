public abstract class AuthorizationChain {
    public static int cashier = 1;
    public static int seniorOfficer = 2;
    public static int manager = 3;
 
    protected int level;
 
    //next element in chain or responsibility
    protected Autorizer nextAuthorizer;
 
    public void setnextAuthorizer(Autorizer nextAuthorizer){
       this.nextAuthorizer = nextAuthorizer;
    }
 
    public void logMessage(int level, String message){
       if(this.level <= level){
          write(message);
       }
       if(nextAuthorizer !=null){
          nextAuthorizer.logMessage(level, message);
       }
    }
 
    abstract protected void write(String message);
     
 }