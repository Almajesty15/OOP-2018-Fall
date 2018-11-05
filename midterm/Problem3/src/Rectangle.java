public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() { }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }

    public void setLength(double length) { this.length = length; }

    public double getArea() { return width * length; }

    public double getPerimeter() { return 2 * (length + width); }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) obj;
        return (r.color.equals(color) && r.length == length && r.width == width);
    }

    public String toString() {
        if (filled)
            return "The shape is filled in " + color;
        return "The shape is not filled";
    }
}
