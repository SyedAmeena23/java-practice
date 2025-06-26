class Rectangle {
    int length;
    int breadth;

    int getArea() {
        return length * breadth;
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.breadth = 4;

        System.out.println("Area = " + r1.getArea());
    }
}

Output
Area = 20
