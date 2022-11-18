public class WalkForward implements Order {
    private Robot command;
 
    public WalkForward(Robot command){
       this.command = command;
    }
 
    public void execute() {
       command.walk_forward();
    }
 }