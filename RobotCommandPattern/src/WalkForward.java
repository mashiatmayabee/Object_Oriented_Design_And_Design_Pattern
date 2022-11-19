import javax.xml.stream.events.Comment;

public class WalkForward implements Order{
    private Command command;

    WalkForward(Command command){
        this.command = command ;
    }
    public void execute(){
        command.WalkForward();
    }
}
