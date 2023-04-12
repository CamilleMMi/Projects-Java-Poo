package projectjavajpoo.exercice9;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    public int areaCalculation() {
        return this.getHeight() * this.getWidth();
    }
}