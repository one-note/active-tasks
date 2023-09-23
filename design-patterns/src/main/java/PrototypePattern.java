interface Shape {
    Shape clone();
    void draw();
}

class Circle implements Shape {
    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square implements Shape {
    @Override
    public Shape clone() {
        return new Square();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle();
        Shape circleClone = circlePrototype.clone();
        circleClone.draw();

        Shape squarePrototype = new Square();
        Shape squareClone = squarePrototype.clone();
        squareClone.draw();
    }
}
