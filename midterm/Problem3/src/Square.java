public class Square extends Rectangle {
    public Square() { }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return super.getLength(); }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double width) { this.width = width; }

    public void setLength(double length) { this.length = length; }
}
