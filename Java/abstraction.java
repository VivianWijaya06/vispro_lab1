package Java;

public class abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}


