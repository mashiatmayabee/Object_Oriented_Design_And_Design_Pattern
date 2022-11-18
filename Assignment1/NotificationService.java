import java.util.Scanner;

public class NotificationService {
    public static void main(String[] args){
        System.out.println("Enter any type of notification you want to pass");
            System.out.println("1. SMS");
            System.out.println("2. Email");
            System.out.println("3. Push");
            System.out.println("====================================");

            Scanner sc = new Scanner(System.in); 
            String order = sc.nextLine();
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(order);
        notification.notifyUser();
    }
}