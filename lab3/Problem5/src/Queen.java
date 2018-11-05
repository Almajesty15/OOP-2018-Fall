import java.awt.*;

public class Queen extends Piece {
    public Queen(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return ax == bx || ay == by || ax + ay == bx + by || ax - ay == bx - by;
    }
}
