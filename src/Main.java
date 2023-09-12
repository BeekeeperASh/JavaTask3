public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(50, 50, 30, 30);
        point.moveRight();
        System.out.println(point);

        System.out.println();

        MovableCircle circle = new MovableCircle(0, 0, 10, 10, 5);
        circle.moveRight();
        System.out.println(circle);


    }
}