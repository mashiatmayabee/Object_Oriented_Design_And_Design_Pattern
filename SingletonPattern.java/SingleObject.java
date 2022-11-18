public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        if(instance==null)
        return instance;
    }
    public void showMessage(){
        System.out.println("Hellow World!");
    }
}
