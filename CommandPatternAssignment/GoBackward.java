public class GoBackward implements Order {
    private Robot command;
 
    public GoBackward(Robot command){
       this.command = command;
    }
 
    public void execute() {
       command.go_backward();
    }
 }