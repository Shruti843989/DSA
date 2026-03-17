class Shape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
    void erase() {
        System.out.println("Erasing a Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
    void erase() {
        System.out.println("Erasing a Square");
    }
}
public class poly {
    public static void main(String[] args) {
    Shape s;

        s = new Circle();
        s.draw();
        s.erase();

        s = new Triangle();
        s.draw();
        s.erase();

        s = new Square();
        s.draw();
        s.erase();
    }
}

