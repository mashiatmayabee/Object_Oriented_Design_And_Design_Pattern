public class TurnLeft implements Order{
    private Command command;
    public TurnLeft(Command command){
        this.command = command;
    }
    public void execute(){
        command.TurnLeft();
    }
}
