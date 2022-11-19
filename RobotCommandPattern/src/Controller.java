import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    List<Order> orderList = new ArrayList<Order>();
    public void GiveOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
