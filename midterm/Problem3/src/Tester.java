public class Tester {
    public static void main(String[] args) {
        Circle c = new Circle(6, "red", true);
        System.out.println(c.toString());

        Circle c1 = new Circle(6, "red", true);

        if (c1.equals(c)) System.out.println("Circles are equal");
        else System.out.println("Circles are not equal");

        Square sq = new Square(5, "green", true);

        System.out.println(sq.getSide());
        System.out.println(sq.getColor());

        Rectangle r = new Rectangle(3, 4, "green", true);
        if (sq.equals(r)) System.out.println("Shapes are equal");
        else System.out.println("Shapes are not equal");
    }
}
