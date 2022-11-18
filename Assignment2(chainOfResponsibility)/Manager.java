public class Manager extends AbstractLogger {

    public Manager(int level){
       this.level = level;
    }
 
    @Override
    protected void write(String message) {		
       System.out.println("Authorized by manager" + message);
    }
 }