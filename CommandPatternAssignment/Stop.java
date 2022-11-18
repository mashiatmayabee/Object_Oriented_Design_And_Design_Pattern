public class Stop implements Order {
    private Robot command;
 
    public Stop(Robot command){
       this.command = command;
    }
 
    public void execute() {
       command.stop();
    }
 }