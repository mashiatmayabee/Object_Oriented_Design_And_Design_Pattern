public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("hydra,jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}