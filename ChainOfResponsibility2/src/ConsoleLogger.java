public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level){
        this.level = level;
    }
    protected void write(String message){
        System.out.println("Console Loggerr : " + message);
    }
}
