import java.awt.*;

public class Knight extends Piece {
    public Knight(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return Math.abs(ax - bx) * Math.abs(ay - by) == 2;
    }
}
