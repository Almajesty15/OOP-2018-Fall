public class Circle extends Shape {
    protected double radius;

    public Circle() { }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    public double getArea() { return radius * radius * Math.PI; }

    public double getPerimeter() { return 2 * radius * Math.PI; }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;

        Circle c = (Circle) obj;
        return (c.color.equals(color) && c.radius == radius);
    }

    public String toString() {
        if (filled)
            return "The circle is filled in " + color;
        return "The circle is not filled";
    }
}
