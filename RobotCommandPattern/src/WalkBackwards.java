public class WalkBackwards implements Order{
    private Command command;
    public WalkBackwards(Command command){
        this.command = command;
    }
    public void execute(){
        command.TurnRight();
    }
}
