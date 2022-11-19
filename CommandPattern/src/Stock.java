import java.util.Scanner;

public class Stock {
    Scanner sc = new Scanner(System.in);

    private String name = sc.nextLine() ;
    private int quantity = sc.nextInt() ;
    public void buy(){
        System.out.println("Stock [Name: "+name+" Quantty: "+quantity+"] bought");
    }
    public void sell(){
        System.out.println("Stock [Name: "+name+" Quantity: "+quantity+"] sold");
    }
}
