/**
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    // Write your code here
    public void draw()
    {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Square implements Shape {
    // Write your code here
    public void draw()
    {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Triangle implements Shape {
    // Write your code here
    public void draw()
    {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}

public class ShapeFactory {
    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        // Write your code here
        switch(shapeType)
        {
            case "Square": return new Square();
            case "Triangle": return new Triangle();
            case "Rectangle": return new Rectangle();
        }
        return null;
    }
}