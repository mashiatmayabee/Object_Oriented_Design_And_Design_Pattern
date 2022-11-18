import java.util.Scanner; 
public class RobotControlDemo {
    public static void main(String[] args) {
        Robot abcRobot = new Robot();

        WalkForward  walkForwardOrder = new WalkForward (abcRobot);
        Stop  stopOrder = new Stop (abcRobot);
        TurnLeft  turnLeftOrder = new TurnLeft (abcRobot);
        TurnRight  turnRightOrder = new TurnRight (abcRobot);
        GoBackward  goBackwardOrder = new GoBackward (abcRobot);
       
 
        RobotController controller = new RobotController();

        while(true){
            System.out.println("Enter any of the following order to control the robot");
            System.out.println("1. Walking Forward");
            System.out.println("2. Stop Robot");
            System.out.println("3. Turning Left");
            System.out.println("4. Turning Right");
            System.out.println("5. Going Backwards");
            System.out.println("====================================");

            Scanner sc = new Scanner(System.in); 
            Integer order = sc.nextInt();
            switch(order){
                case 1:{
                    controller.takeOrder(walkForwardOrder);
                    break;
                }
                case 2:{
                    controller.takeOrder(stopOrder);
                    break;
                }
                case 3:{
                    controller.takeOrder(turnLeftOrder);
                    break;
                }
                case 4:{
                    controller.takeOrder(turnRightOrder);
                    break;
                }
                case 5:{
                    controller.takeOrder(goBackwardOrder);
                    break;
                }
                default:
                    System.out.println("Enter any valid instuction");
                    break;
            }

            controller.placeOrders();
            System.out.println("====================================");

        }
        
    }
 }