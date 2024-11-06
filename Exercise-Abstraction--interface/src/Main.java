//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(3,4,2,6);

        movablePoint.printPosition();

        movablePoint.moveRight();
        movablePoint.moveLeft();
        movablePoint.moveDown();
        movablePoint.moveUp();



    }
}