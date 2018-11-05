import java.awt.*;

public class Bishop extends Piece {
    public Bishop(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return ax + ay == bx + by || ax - ay == bx - by;
    }
}
