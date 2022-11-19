public class RobotSimulationDemo {
    public static void main(String[] args) {
        Command command = new Command();
        WalkForward  walkForwardOrder = new WalkForward (command);
        Stop  stopOrder = new Stop (command);
        TurnLeft  turnLeftOrder = new TurnLeft (command);
        TurnRight  turnRightOrder = new TurnRight (command);
        WalkBackwards  goBackwardOrder = new WalkBackwards (command);

        Controller controller = new Controller();
        controller.GiveOrder(turnLeftOrder);
        controller.GiveOrder(turnRightOrder);
        controller.placeOrder();

    }
}
