public class Stop implements Order{
    private Command command;

    public Stop(Command robot) {
    }

    public void Stop(Command command){
        this.command = command;
    }
    public void execute(){
        command.Stop();
    }
}
