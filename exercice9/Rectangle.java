package projectjavajpoo.exercice9;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void display() {
        for(int x = 0; x < width; x += 1) {
            for(int y = 0; y < height; y += 1) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public int areaCalculation() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
