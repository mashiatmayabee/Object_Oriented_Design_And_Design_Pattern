public class TurnRight implements Order {
    private Robot command;
 
    public TurnRight(Robot command){
       this.command = command;
    }
 
    public void execute() {
      command.turn_right();
    }
 }