public class seniorOfficer extends AbstractLogger {

    public seniorOfficer(int level){
       this.level = level;
    }
 
    @Override
    protected void write(String message) {		
       System.out.println("Authorized by senior officer " + message);
    }
 }
 