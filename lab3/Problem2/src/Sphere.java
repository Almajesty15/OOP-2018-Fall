public class Sphere extends Shape {
    private int radius;

    public Sphere(int radius){
        this.radius = radius;
    }

    public double surfaceArea() { return 4 * Math.PI * radius * radius; }

    public double volume() { return 4.0 / 3 * Math.PI * Math.pow(radius, 3); }

    public double edgesLength() { return 0; }
}
