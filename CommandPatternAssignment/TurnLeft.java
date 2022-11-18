public class TurnLeft implements Order {
    private Robot command;
 
    public TurnLeft(Robot command){
       this.command = command;
    }
 
    public void execute() {
       command.turn_left();
    }
 }