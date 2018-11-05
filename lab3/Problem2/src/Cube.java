public class Cube extends Shape {
    private int side;

    public Cube(int side){
        this.side = side;
    }

    public double surfaceArea() { return 6 * side * side; }

    public double volume() { return Math.pow(side, 3); }

    public double edgesLength() { return 12 * side; }
}
