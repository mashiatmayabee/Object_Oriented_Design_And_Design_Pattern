public class TurnRight implements Order{
    private Command command;
    public TurnRight(Command command){
        this.command = command;
    }
    public void execute(){
        command.TurnRight();
    }
}
