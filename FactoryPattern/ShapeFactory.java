package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("Ractangle")){
            return new Ractactangle();
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
