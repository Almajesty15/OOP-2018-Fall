public class Cylinder extends Shape {
    private int radius, height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() { return 2 * Math.PI * radius * (height + radius); }

    public double volume() { return Math.PI * radius * radius * height; }

    public double edgesLength() { return 4 * Math.PI * radius; }
}
